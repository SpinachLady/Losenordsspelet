package LevelClasses;

public abstract class Levels {

    public StringBuilder instruction = new StringBuilder().append("Ditt lösenord måste innehålla ");
    public abstract boolean checkRequirements(String input);

}
