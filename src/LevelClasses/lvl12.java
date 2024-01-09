package LevelClasses;

public class lvl12 extends Level{

    public lvl12 () {
        instruction.delete(0, instruction.length());
        instruction.append("Alla vokaler i ditt lösenord ska vara stor bokstav");
    }
    @Override
    public boolean checkRequirements(String input) {
        return false;
    }
}
