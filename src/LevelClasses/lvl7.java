package LevelClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lvl7 extends Level {

    public lvl7 () {
        instruction.delete(0, instruction.length());
        instruction.append("Planeter skrivs med stor bokstav hörru!");
    }
    File planets = new File("src/LevelClasses/Datafiles/Planets.txt");
    Scanner scanFile;

    @Override
    public boolean checkRequirements(String input) {
        try {
            scanFile = new Scanner(planets);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanFile.hasNext()) {
            String s = scanFile.nextLine();
            if (input.contains(s)) {
                return true;
            }
        }
        return false;
    }
}
