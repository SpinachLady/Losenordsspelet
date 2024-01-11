package LevelClasses;

public class lvl14 extends Level{

    public lvl14() {
        instruction.delete(0, instruction.length());
        instruction.append("Ditt lösenord får max vara 20 tecken långt");
    }
    @Override
    public boolean checkRequirements(String input) {
        if (input.length() > 20) {
            return false;
        } else {
            return true;
        }
    }
}