package LevelClasses;

public class lvl3 extends Levels{

    String specialTecken = "!@#£¤$%&/{([)]=}?+´`¨~^*'<>|;,:.-_";
    @Override
    boolean checkRequirements(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (specialTecken.indexOf(input.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
}
