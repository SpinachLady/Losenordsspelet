package LevelClasses;

public class lvl12 extends Level{

    String hardaVokaler = "aouå";
    String mjukaVokaler = "eiyäö";
    public lvl12 () {
        instruction.delete(0, instruction.length());
        instruction.append("Alla hårda vokaler i ditt lösenord ska vara stor bokstav och alla mjuka ska vara små");
    }
    @Override
    public boolean checkRequirements(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (hardaVokaler.contains(input.substring(i, i+1).toLowerCase())){
                if (!Character.isUpperCase(input.charAt(i))){
                    return false;
                }
            } if (mjukaVokaler.contains(input.substring(i, i+1).toLowerCase())) {
                if (Character.isUpperCase(input.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}