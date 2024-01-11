package LevelClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class lvl8 extends Level {
    File unicodeSymbols = new File("src/LevelClasses/Datafiles/Characters.txt");
    Scanner scanFile;
    String randomLine;
    String symbol;
    String unicode;

    public lvl8 (boolean isTest) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            scanFile = new Scanner(unicodeSymbols);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanFile.hasNext()) {
            String s = scanFile.nextLine();
            lines.add(s);
        }
        if (isTest) {
            randomLine = "😝:U+1F61D";
        }
        else {
            int random = (int) (Math.random() * lines.size());
            randomLine = lines.get(random);
        }
        symbol = randomLine.substring(0, randomLine.indexOf(":"));
        unicode = randomLine.substring(randomLine.indexOf(":") + 1);

        instruction.append("innehålla symbolen som har denna unicode-kod: ").append(unicode);
    }

    @Override
    public boolean checkRequirements(String input) {
        if (input.contains(symbol)) {
            return true;
        }
        else {
            return false;
        }
    }
}
