import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightToggle extends JFrame {

    private JToggleButton redBtn, yellowBtn, greenBtn;
    private JPanel lightPanel;

    public TrafficLightToggle() {
        setTitle("Traffic Light Simulation");
        setSize(250, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Toggle Buttons
        redBtn = new JToggleButton("Red");
        yellowBtn = new JToggleButton("Yellow");
        greenBtn = new JToggleButton("Green");

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        buttonPanel.add(redBtn);
        buttonPanel.add(yellowBtn);
        buttonPanel.add(greenBtn);

        // Panel to show light color
        lightPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw three circles
                g.setColor(Color.GRAY);
                g.fillOval(50, 20, 100, 100);
                g.fillOval(50, 120, 100, 100);
                g.fillOval(50, 220, 100, 100);

                // Light up based on selection
                if (redBtn.isSelected()) {
                    g.setColor(Color.RED);
                    g.fillOval(50, 20, 100, 100);
                } else if (yellowBtn.isSelected()) {
                    g.setColor(Color.YELLOW);
                    g.fillOval(50, 120, 100, 100);
                } else if (greenBtn.isSelected()) {
                    g.setColor(Color.GREEN);
                    g.fillOval(50, 220, 100, 100);
                }
            }
        };

        // Action Listeners
        ActionListener action = e -> {
            JToggleButton source = (JToggleButton) e.getSource();

            // Ensure only one button can be active
            redBtn.setSelected(source == redBtn);
            yellowBtn.setSelected(source == yellowBtn);
            greenBtn.setSelected(source == greenBtn);

            lightPanel.repaint();
        };

        redBtn.addActionListener(action);
        yellowBtn.addActionListener(action);
        greenBtn.addActionListener(action);

        setLayout(new BorderLayout(10, 10));
        add(buttonPanel, BorderLayout.WEST);
        add(lightPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new TrafficLightToggle().setVisible(true);
    }
}


