import LevelClasses.*;

import java.util.ArrayList;

public class Levels {
    lvl1 lvl1 = new lvl1();
    lvl2 lvl2 = new lvl2();
    lvl3 lvl3 = new lvl3();
    lvl4 lvl4 = new lvl4();
    lvl5 lvl5 = new lvl5();
    lvl6 lvl6 = new lvl6();
    lvl7 lvl7 = new lvl7();
    lvl8 lvl8 = new lvl8(false);
    lvl9 lvl9 = new lvl9();
    lvl10 lvl10 = new lvl10();
    private final ArrayList<Level> allLevels = new ArrayList<>();
    boolean allActiveLevelsPassed;
    String input;

    public Levels () {
        allLevels.add(lvl1);
        allLevels.add(lvl2);
        allLevels.add(lvl3);
        allLevels.add(lvl4);
        allLevels.add(lvl5);
        allLevels.add(lvl6);
        allLevels.add(lvl7);
        allLevels.add(lvl8);
        allLevels.add(lvl9);
        allLevels.add(lvl10);
    }

    public ArrayList<Level> getAllLevels () {
        return allLevels;
    }
    public ArrayList<Level> getActiveLevels() {
        ArrayList<Level> activeLevels = new ArrayList<>();
        for (Level level : allLevels) {
            if (level.isActive) {
                activeLevels.add(level);
            }
        }
        return activeLevels;
    }

    public ArrayList<Level> getUnpassedLevels(String input) {
        ArrayList<Level> unpassedLevels = new ArrayList<>();
        this.input = input;
        allActiveLevelsPassed = true;
        for (Level level : getActiveLevels()) {
            if (!level.checkRequirements(input)) {
                allActiveLevelsPassed = false;
                unpassedLevels.add(level);
            }
        }
        if (allActiveLevelsPassed) {
            while (true) {
                int i = getActiveLevels().size();
                allLevels.get(i).setToActive();
                if (!allLevels.get(i).checkRequirements(input)) { //om den aktiverade leveln redan är uppfylld aktiveras en ny
                    unpassedLevels.add(allLevels.get(i));
                    break;
                }
            }
        }
        return unpassedLevels;
    }
    public void openNewLevel() {

    }
}
