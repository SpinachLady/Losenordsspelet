import javax.swing.*;

//statiska metoder för GUI
public class GuiSM {

    public static void revrep(JFrame frame) {
        frame.revalidate();
        frame.repaint();
    }


    public static void remove(JPanel panel1) {
        panel1.removeAll();
    }
    public static void remove(JPanel panel1, JPanel panel2) {
        panel1.removeAll();
        panel2.removeAll();
    }
    public static void remove(JPanel panel1, JPanel panel2, JPanel panel3) {
        panel1.removeAll();
        panel2.removeAll();
        panel3.removeAll();
    }
}
