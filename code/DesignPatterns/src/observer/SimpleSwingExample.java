package observer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SimpleSwingExample {

    public static void main(String[] args) {
        // GUI toolkit for Java

        JFrame frame = new JFrame("Frame Title");
        final JTextArea comp = new JTextArea();
        JButton btn = new JButton("click");
        frame.getContentPane().add(comp, BorderLayout.CENTER);
        frame.getContentPane().add(btn, BorderLayout.SOUTH);

        // Subscribing new listeners or observers.
        AngelListener angelListener = new AngelListener();
        btn.addActionListener(angelListener);
        btn.addActionListener(new DevilListener());
        btn.removeActionListener(angelListener);

        int width = 300;
        int height = 300;
        frame.setSize(width, height);
        frame.setVisible(true);
    }

    static class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Come on, do it!");
        }
    }

    static class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Don't do it, you might regret it.");
        }
    }
}