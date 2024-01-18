import LevelClasses.*;

import java.util.ArrayList;

public class Levels {
    private lvl1 lvl1 = new lvl1();
    private lvl2 lvl2 = new lvl2();
    private lvl3 lvl3 = new lvl3();
    private lvl4 lvl4 = new lvl4();
    private lvl5 lvl5 = new lvl5();
    private lvl6 lvl6 = new lvl6();
    private lvl7 lvl7 = new lvl7();
    private lvl8 lvl8 = new lvl8();
    private lvl9 lvl9 = new lvl9();
    private lvl10 lvl10 = new lvl10();
    private lvl11 lvl11 = new lvl11();
    private lvl12 lvl12 = new lvl12();
    private lvl13 lvl13 = new lvl13();
    private lvl14 lvl14 = new lvl14();
    private lvl15 lvl15 = new lvl15();
    private final ArrayList<Level> allLevels = new ArrayList<>();
    private boolean allActiveLevelsPassed;
    private String input;

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
        allLevels.add(lvl11);
        allLevels.add(lvl12);
        allLevels.add(lvl13);
        allLevels.add(lvl14);
        allLevels.add(lvl15);
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
                if (i > 14) {
                    break;
                }
                allLevels.get(i).setToActive();
                if (!allLevels.get(i).checkRequirements(input)) { //om den aktiverade leveln redan är uppfylld aktiveras en ny
                    unpassedLevels.add(allLevels.get(i));
                    break;
                }
            }
        }
        return unpassedLevels;
    }
}
