import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    public Gui() {
        JFrame frame = new JFrame("Lösenordsspelet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new GridLayout(1,3));
        JPanel middlePanel = new JPanel(new BorderLayout());
        JPanel bottomPanel = new JPanel(new BorderLayout());


        JLabel headerLabel = new JLabel("Välj ett lösenord");
        headerLabel.setPreferredSize(new Dimension(600, 80));
        topPanel.add(headerLabel, BorderLayout.CENTER);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        JTextField pwField = new JTextField();
        pwField.setPreferredSize(new Dimension(400, 60));
        mainPanel.add(pwField, BorderLayout.CENTER);

        JPanel instructionPanel = new JPanel();
        instructionPanel.setPreferredSize(new Dimension(600, 200));

        mainPanel.add(instructionPanel, BorderLayout.SOUTH);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

}
