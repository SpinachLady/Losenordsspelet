package LevelClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lvl6 extends Level {

    public lvl6 () {
        instruction.append("innehålla namnet på en planet i vårt solsystem");
    }
    File planets = new File ("src/LevelClasses/Datafiles/Planets.txt");
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
            if (input.toLowerCase().contains(s.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
