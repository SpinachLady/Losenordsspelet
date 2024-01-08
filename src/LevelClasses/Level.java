package LevelClasses;

public abstract class Level {

    public StringBuilder instruction = new StringBuilder().append("Ditt lösenord måste ");
    public boolean isActive;
    public abstract boolean checkRequirements(String input);

    public void setToActive() {
        isActive = true;
    }
}
