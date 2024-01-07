package LevelClasses;

public class lvl2 extends Levels{

    public lvl2 () {
        instruction.append("innehålla minst en stor bokstav");
    }

    @Override
    public boolean checkRequirements(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
