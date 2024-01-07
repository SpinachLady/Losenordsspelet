package LevelClasses;

public class lvl1 extends Levels{

    public lvl1 () {
        instruction.append("vara minst 5 tecken långt");
    }

    @Override
    public boolean checkRequirements (String input) {
        if (input.length() >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
