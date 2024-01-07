package LevelClasses;

public class lvl10 extends Levels{

    @Override
    public boolean checkRequirements(String input) {
        return !input.toLowerCase().contains("gul") && !input.toLowerCase().contains("yellow");
    }


}
