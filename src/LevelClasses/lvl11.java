package LevelClasses;

public class lvl11 extends Level{

    public lvl11 () {
        instruction.delete(0, instruction.length());
        instruction.append("Siffrorna i ditt lösenord måste ha en summa på 33");
    }

    @Override
    public boolean checkRequirements(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count = count + Integer.parseInt(String.valueOf(input.charAt(i)));
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
