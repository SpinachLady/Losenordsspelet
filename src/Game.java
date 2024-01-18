import LevelClasses.Level;

import javax.swing.event.DocumentEvent;
import java.util.ArrayList;

public class Game {
    Gui gui = new Gui();
    Levels levels = new Levels();
    public Game () {
        gui.pwField.getDocument().addDocumentListener(new pwFieldListener() {
            @Override
            public void update(DocumentEvent e) {
                String input = gui.pwField.getText();
                ArrayList<Level> unpassedLevels = levels.getUnpassedLevels(input);
                if (unpassedLevels.isEmpty()) {
                    gui.gameComplete();
                } else {
                    gui.addInstruction(unpassedLevels);
                }
            }
        });
    }


}