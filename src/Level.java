public class Level {
    private static int lvlNumber = 0;
    private int thisLvlNumber;
    private String requirement;
    private boolean active = false;

    public Level() {
        thisLvlNumber = lvlNumber;
        lvlNumber++;
    }

    public void setActive() {
        active = true;
    }


}
