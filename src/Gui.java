import LevelClasses.Level;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gui {
    private JFrame frame = new JFrame("Lösenordsspelet");
    private JPanel topPanel = new JPanel(new GridLayout(1,3));
    private JPanel middlePanel = new JPanel(new GridBagLayout());
    private JPanel bottomPanel = new JPanel(new GridLayout(6,1));
    private JLabel headerLabel = new JLabel("Välj ett lösenord");
    public JTextField pwField = new JTextField();
    private Font headerFont = new Font("Arial", Font.PLAIN, 20);
    private Color backgroundColor = new Color(212, 243, 252);

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
        while (levels.size() > 6) {
            levels.remove(6);
        }
        for (Level level : levels) {
            JLabel insLabel = new JLabel("ⓘ" + level.instruction);
            insLabel.setForeground(Color.red);
            insLabel.setHorizontalAlignment(SwingConstants.CENTER);
            insLabel.setVerticalAlignment(SwingConstants.CENTER);
            bottomPanel.add(insLabel);
        }
        bottomPanel.revalidate();
        bottomPanel.repaint();
    }
}
