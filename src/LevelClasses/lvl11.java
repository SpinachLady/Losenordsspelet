package LevelClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lvl11 extends Level{

    File romanNumerals = new File("src/LevelClasses/Datafiles/RomanNumerals.txt");
    Scanner scanFile;
    String romerskaSiffror;
    String[] romerskaSiffror_value;
    public lvl11 () {
        try {
            scanFile = new Scanner(romanNumerals);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        romerskaSiffror = scanFile.nextLine();
        romerskaSiffror_value = scanFile.nextLine().split(":");
        instruction.delete(0, instruction.length());
        instruction.append("Siffrorna i ditt lösenord (inkl de romerska) måste ha en summa på 33");
    }

    @Override
    public boolean checkRequirements(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count = count + Integer.parseInt(String.valueOf(input.charAt(i)));
            }else if (romerskaSiffror.contains(input.substring(i, i+1))) {
                int j = romerskaSiffror.indexOf(input.substring(i,i+1));
                int add = Integer.parseInt(romerskaSiffror_value[j]);
                count = count + add;
            }
        }
        if (count == 33) {
            return true;
        }
        else {
            return false;
        }
    }
}
