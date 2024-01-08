package LevelClasses;

public class lvl4 extends Level {
    public lvl4 () {
        instruction.append("innehålla minst en siffra");
    }

    String siffror = "0123456789";
    @Override
    public boolean checkRequirements(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (siffror.indexOf(input.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
}
