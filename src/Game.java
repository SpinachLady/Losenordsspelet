import LevelClasses.Level;

import javax.swing.event.DocumentEvent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Game {
    Gui gui = new Gui();
    Levels levels = new Levels();
    String finalPassword = "";
    public Game () {
        gui.pwField.getDocument().addDocumentListener(new pwFieldListener() {
            @Override
            public void update(DocumentEvent e) {
                String input = gui.pwField.getText();
                if (finalPassword.isEmpty()) {
                    ArrayList<Level> unpassedLevels = levels.getUnpassedLevels(input);
                    if (unpassedLevels.isEmpty()) {
                        finalPassword = input;
                        gui.passwordSuccessful();
                    } else {
                        gui.addInstruction(unpassedLevels);
                    }
                } else {
                    if (Objects.equals(input, finalPassword)) {
                        gui.setUpWinFrame();
                    }
                }
            }
        });
    }


}