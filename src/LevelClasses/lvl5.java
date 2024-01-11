package LevelClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lvl5 extends Level {
    public lvl5 () {
        instruction.append("även innehålla minst en romersk siffra");
    }
    File romanNumerals = new File ("src/LevelClasses/Datafiles/RomanNumerals.txt");
    Scanner scanFile;
    @Override
    public boolean checkRequirements(String input) {
        try {
            scanFile = new Scanner(romanNumerals);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String romerskaSiffror = scanFile.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (romerskaSiffror.indexOf(input.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
}
