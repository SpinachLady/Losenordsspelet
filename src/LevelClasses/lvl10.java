package LevelClasses;

public class lvl10 extends Levels{

    public lvl10 () {
        instruction.delete(0, instruction.length());
        instruction.append("Gult är fult! Välj någon annan färg");
    }
    @Override
    public boolean checkRequirements(String input) {
        return !input.toLowerCase().contains("gul") && !input.toLowerCase().contains("yellow");
    }


}
