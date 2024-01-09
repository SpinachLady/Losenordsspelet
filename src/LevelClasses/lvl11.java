package LevelClasses;

public class lvl11 extends Level{

    public lvl11 () {
        instruction.delete(0, instruction.length());
        instruction.append("Siffrorna i ditt lösenord måste ha en summa på 33");
    }

    @Override
    public boolean checkRequirements(String input) {
        return false;
    }
}
