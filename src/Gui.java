import javax.swing.*;
import java.awt.*;

public class Gui {
    public Gui() {
        JFrame frame = new JFrame("Lösenordsspelet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new GridLayout(1,3));
        JPanel middlePanel = new JPanel(new BorderLayout());
        JPanel bottomPanel = new JPanel(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(600, 80));
        middlePanel.setPreferredSize(new Dimension(600, 100));
        bottomPanel.setPreferredSize(new Dimension(600, 220));

        JLabel headerLabel = new JLabel("Välj ett lösenord");
        JLabel headerLabel1 = new JLabel("");
        JLabel headerLabel2 = new JLabel("");
        headerLabel1.setPreferredSize(new Dimension(200, 30));
        headerLabel2.setPreferredSize(new Dimension(200, 30));

        headerLabel.setPreferredSize(new Dimension(200, 30));
        topPanel.add(headerLabel1);
        topPanel.add(headerLabel);
        topPanel.add(headerLabel2);

        mainPanel.add(topPanel, BorderLayout.NORTH);

        JTextField pwField = new JTextField();
        pwField.setPreferredSize(new Dimension(400, 30));
        middlePanel.add(pwField, BorderLayout.CENTER);
        mainPanel.add(middlePanel, BorderLayout.CENTER);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

}
