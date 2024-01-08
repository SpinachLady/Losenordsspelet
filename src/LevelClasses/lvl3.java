package LevelClasses;

public class lvl3 extends Level {

    public lvl3 () {
        instruction.append("innehålla minst ett specialtecken");
    }
    String specialTecken = "!@#£¤$%&/{([)]=}?+´`¨~^*'<>|;,:.-_";
    @Override
    public boolean checkRequirements(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (specialTecken.indexOf(input.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
}
