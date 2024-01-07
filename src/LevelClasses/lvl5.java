package LevelClasses;

public class lvl5 extends Levels{
    public lvl5 () {
        instruction.append("även innehålla minst en romersk siffra");
    }
    String romerskaSiffror = "IVXLCDM";
    @Override
    public boolean checkRequirements(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (romerskaSiffror.indexOf(input.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
}
