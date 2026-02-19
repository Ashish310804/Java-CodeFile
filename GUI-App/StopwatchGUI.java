import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchGUI extends JFrame {

    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;

    private int elapsedTime = 0; // in milliseconds
    private boolean running = false;

    public StopwatchGUI() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        timeLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 32));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        // Timer with 1-second (1000ms) interval
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elapsedTime += 1000;
                updateTimeLabel();
            }
        });

        // Start Button Action
        startButton.addActionListener(e -> {
            if (!running) {
                timer.start();
                running = true;
            }
        });

        // Stop Button Action
        stopButton.addActionListener(e -> {
            timer.stop();
            running = false;
        });

        // Reset Button Action
        resetButton.addActionListener(e -> {
            timer.stop();
            running = false;
            elapsedTime = 0;
            updateTimeLabel();
        });

        setLayout(new BorderLayout(10, 10));
        add(timeLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void updateTimeLabel() {
        int sec = (elapsedTime / 1000) % 60;
        int min = (elapsedTime / (1000 * 60)) % 60;
        int hr = elapsedTime / (1000 * 60 * 60);

        String timeText = String.format("%02d:%02d:%02d", hr, min, sec);
        timeLabel.setText(timeText);
    }

    public static void main(String[] args) {
        new StopwatchGUI().setVisible(true);
    }
}

