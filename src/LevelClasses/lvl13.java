package LevelClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lvl13 extends Level{
    File officePackage = new File("src/LevelClasses/Datafiles/Officepackage.txt");
    Scanner scanFile;

    public lvl13() {

        instruction.append("innehålla namnet på ett av programmen som ingår i Microsoft Office-paketet");
    }

    @Override
    public boolean checkRequirements(String input) {
        try {
            scanFile = new Scanner(officePackage);
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
