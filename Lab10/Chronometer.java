package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chronometer implements ActionListener {
    JFrame frame = new JFrame();
    JButton startButton = new JButton("Start");
    JButton resetButton = new JButton("Reset");
    JLabel timeLabel = new JLabel();

    int elapsedTime;
    int seconds;
    int minutes;
    int hours;
    boolean started;

    String secondsString = String.format("%02d", seconds);
    String minutesString = String.format("%02d", minutes);
    String hoursString = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            elapsedTime=elapsedTime + 1000;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            secondsString = String.format("%02d", seconds);
            minutesString = String.format("%02d", minutes);
            hoursString = String.format("%02d", hours);
            timeLabel.setText(hoursString+":"+minutesString+":"+secondsString);
        }

    });

    Chronometer(){
        this.elapsedTime = 0;
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
        this.started = false;

        timeLabel.setText(hoursString + ":"+minutesString + ":" + secondsString);
        timeLabel.setBounds(100,100,200,100);
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(100,200,100,50);
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setBounds(200,200,100,50);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(startButton);
        frame.add(resetButton);
        frame.add(timeLabel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton) {
            if(!started) {
                started = true;
                startButton.setText("Stop");
                start();
            }
            else {
                started = false;
                startButton.setText("Start");
                stop();
            }
        }
        if(e.getSource() == resetButton) {
            started = false;
            startButton.setText("Start");
            reset();
        }
    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        secondsString = String.format("%02d", seconds);
        minutesString = String.format("%02d", minutes);
        hoursString = String.format("%02d", hours);
        timeLabel.setText(hoursString+":"+minutesString+":"+secondsString);
    }

    public static void main(String[] args) {
        JFrame chronometer = new JFrame();
    }
}