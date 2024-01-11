package LevelClasses;

public class lvl14 extends Level{

    public lvl14() {
        instruction.delete(0, instruction.length());
        instruction.append("Ditt lösenord får max vara 30 tecken långt");
    }
    @Override
    public boolean checkRequirements(String input) {
        if (input.length() > 30) {
            return false;
        } else {
            return true;
        }
    }
}