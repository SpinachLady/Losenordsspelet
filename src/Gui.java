import LevelClasses.Level;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui {
    private JFrame frame = new JFrame("Lösenordsspelet");
    private JPanel topPanel = new JPanel(new GridLayout(1,3));
    private JPanel middlePanel = new JPanel(new GridBagLayout());
    private JPanel bottomPanel = new JPanel(new GridLayout(6,1));
    private JLabel headerLabel = new JLabel();
    private JPanel topOfBottomPanel = new JPanel(new GridBagLayout());
    private JLabel rule = new JLabel("Obs! Tillåtna språk är, om inte annat anges, alltid svenska och engelska");
    private JLabel loginSuccessful = new JLabel("Inloggningen lyckades!");
    private JButton startButton = new JButton("Starta");
    private JButton finishButton = new JButton("Gå vidare");
    public JTextField pwField = new JTextField();
    private Font headerFont = new Font("Arial", Font.PLAIN, 20);
    private Font ruleFont = new Font("Arial", Font.ITALIC, 12);
    private Color backgroundColor = new Color(212, 243, 252);
    GridBagConstraints gbc = new GridBagConstraints();

    public Gui() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 370);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

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

        gbc.gridx = 0;
        gbc.gridy = 0;

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        setUpStartField();

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setUpGameField();
            }
        });
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setUpLoginField();
            }
        });
    }
    public void setUpStartField(){
        headerLabel.setText("Välkommen till lösenordsspelet!");
        rule.setFont(ruleFont);
        middlePanel.add(rule, gbc);
        startButton.setPreferredSize(new Dimension(100, 50));
        topOfBottomPanel.setBackground(backgroundColor);
        topOfBottomPanel.add(startButton, gbc);
        bottomPanel.add(topOfBottomPanel);

    }
    public void setUpGameField() {
        topPanel.removeAll();
        middlePanel.removeAll();
        bottomPanel.removeAll();

        headerLabel.setText("Välj ett lösenord");
        topPanel.add(headerLabel);
        pwField.setPreferredSize(new Dimension(400, 30));
        middlePanel.add(pwField, gbc);
        frame.revalidate();
        frame.repaint();
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
    public void passwordSuccessful() {
        bottomPanel.removeAll();
        topPanel.removeAll();
        pwField.setEditable(false);
        headerLabel.setText("Lösenordet uppfyller alla krav!");
        topPanel.add(headerLabel);
        topOfBottomPanel.removeAll();
        topOfBottomPanel.add(finishButton, gbc);
        bottomPanel.add(topOfBottomPanel);

        bottomPanel.revalidate();
        bottomPanel.repaint();
        topPanel.revalidate();
        topPanel.repaint();

    }

    public void setUpLoginField() {
        topPanel.removeAll();
        bottomPanel.removeAll();
        headerLabel.setText("Nu kan du logga in med ditt lösenord");
        topPanel.add(headerLabel);

        pwField.setText("");
        pwField.setEditable(true);

        topPanel.revalidate();
        topPanel.repaint();

    }

    public void setUpWinFrame(){
        bottomPanel.removeAll();
        middlePanel.removeAll();
        topPanel.removeAll();

        middlePanel.add(loginSuccessful, gbc);
        bottomPanel.revalidate();
        bottomPanel.repaint();
        middlePanel.revalidate();
        middlePanel.repaint();
        topPanel.revalidate();
        topPanel.repaint();

    }
}
