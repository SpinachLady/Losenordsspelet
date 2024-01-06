package LevelClasses;

public class lvl2 extends Levels{
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
