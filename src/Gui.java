import LevelClasses.Level;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gui {
    JFrame frame = new JFrame("Lösenordsspelet");
    JPanel topPanel = new JPanel(new GridLayout(1,3));
    JPanel middlePanel = new JPanel(new GridBagLayout());
    JPanel bottomPanel = new JPanel(new GridLayout(6,1));
    JLabel headerLabel = new JLabel("Välj ett lösenord");
    JTextField pwField = new JTextField();
    Font headerFont = new Font("Arial", Font.PLAIN, 20);
    Color backgroundColor = new Color(212, 243, 252);

    public Gui() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 370);
        frame.setResizable(false);

        topPanel.setPreferredSize(new Dimension(600, 80));
        topPanel.setBackground(backgroundColor);
        middlePanel.setPreferredSize(new Dimension(600, 70));
        middlePanel.setBackground(backgroundColor);
        bottomPanel.setPreferredSize(new Dimension(600, 220));
        bottomPanel.setBackground(backgroundColor);

        headerLabel.setFont(headerFont);
        topPanel.add(headerLabel);
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setVerticalAlignment(SwingConstants.CENTER);

        frame.add(topPanel, BorderLayout.NORTH);

        pwField.setPreferredSize(new Dimension(400, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        middlePanel.add(pwField, gbc);
        frame.add(middlePanel, BorderLayout.CENTER);

        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.setVisible(true);

    }

    public void addInstruction(ArrayList<Level> levels) {
        bottomPanel.removeAll();
        for (Level level : levels) {
            JLabel insLabel = new JLabel("ⓘ" + level.instruction);
            insLabel.setForeground(Color.red);
            insLabel.setHorizontalAlignment(SwingConstants.CENTER);
            insLabel.setVerticalAlignment(SwingConstants.CENTER);
            bottomPanel.add(insLabel);
        }
    }

}
