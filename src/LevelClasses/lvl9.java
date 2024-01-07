package LevelClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lvl9 extends Levels{
    File colors = new File("src/LevelClasses/Datafiles/Colors.txt");
    Scanner scanFile;

    @Override
    public boolean checkRequirements(String input) {
        try {
            scanFile = new Scanner(colors);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanFile.hasNext()) {
            String s = scanFile.nextLine();
            if (input.toLowerCase().contains(s.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
