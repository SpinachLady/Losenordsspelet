package LevelClasses;

public class lvl15 extends Level{

    public lvl15 () {
        instruction.delete(0, instruction.length());
        instruction.append("Ditt lösenord får inte innehålla någon av de svenska diakritiska bokstäverna");
    }
    @Override
    public boolean checkRequirements(String input) {
        if (input.toLowerCase().contains("å") || input.toLowerCase().contains("ä") || input.toLowerCase().contains("ö")) {
            return false;
        } else {
            return true;
        }
    }
}
