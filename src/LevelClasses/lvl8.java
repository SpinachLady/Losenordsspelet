package LevelClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lvl8 extends Level{
    Scanner scanFile;
    File periodicTable = new File("src/LevelClasses/Datafiles/PeriodicTable.txt");

    public lvl8() {
        instruction.append("innehålla ett grundämnes kemiska beteckning som består av två bokstäver");
    }
    @Override
    public boolean checkRequirements(String input) {
        try {
            scanFile = new Scanner(periodicTable);
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
