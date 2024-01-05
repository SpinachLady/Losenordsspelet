package LevelClasses;

public class lvl1 extends Levels{
    @Override
    public boolean checkRequirements (String input) {
        if (input.length() >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
