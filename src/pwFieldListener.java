import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
@FunctionalInterface
public interface pwFieldListener extends DocumentListener {
    void update(DocumentEvent e);
    @Override
    default void insertUpdate(DocumentEvent e) {
        update(e);
    }
    @Override
    default void removeUpdate(DocumentEvent e) {
        update(e);
    }
    @Override
    default void changedUpdate(DocumentEvent e) {
        update(e);
    }
}
