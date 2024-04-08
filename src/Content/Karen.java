package Content;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Karen extends JFrame {

    private JButton talkButton;
    private JPanel panel1;
    private JButton resolveButton;
    private JButton levelRecoverButton;
    private JButton correctThemButton;
    private JButton kindlyCoolDownButton;
    private JTextField comfortTF;
    private JTextField heatedTF;
    private JTextField chillinTF;
    private JTextField angerTF;
    private JLabel comfortLabel;
    private JLabel heatedLabel;
    private JLabel chillinLabel;
    private JLabel angerLabel;

    int comfort = 1;
    int heated = 0;
    int chillin = 0;
    int anger = 0;

    public void setTextFieldText() {
        comfortTF.setText(String.valueOf(comfort));
        heatedTF.setText(String.valueOf(heated));
        chillinTF.setText(String.valueOf(chillin));
        angerTF.setText(String.valueOf(anger));
    }

    public Karen() {

        setTitle("Dating Sim");
        setContentPane(panel1);
        setMinimumSize(new Dimension(1000, 1000));
        setVisible(true);

        String filepath2 = "src/Content/ClickSound.wav";
        ClickSound clickSound = new ClickSound();

        talkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);
                Random rand = new Random();
                if (rand.nextDouble() < 0.6) {
                    comfort++;
                    if (comfort > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "She talks back with you",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                    }
                } else if (rand.nextDouble() > 0.5 && rand.nextDouble() < 0.9){
                    comfort--;
                    heated++;
                    JOptionPane.showMessageDialog(new JFrame(), "She gets angrier...",
                                "Dialog",
                                JOptionPane.ERROR_MESSAGE);
                        setTextFieldText();

                    }
                else if (heated > 1 || (rand.nextDouble() > 0.8 && rand.nextDouble() < 11)) {
                    JOptionPane.showMessageDialog(new JFrame(), "She's calling the cops!",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();
                    dispose();
                    System.exit(0);

                }
            }

        });
        kindlyCoolDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);
                Random rand = new Random();
                if ((rand.nextDouble() < 0.5 || comfort > 2) && heated < 2) {
                    comfort++;
                    heated--;
                    if (comfort > 2) {
                        JOptionPane.showMessageDialog(new JFrame(), "She cools down a little",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                    }
                } else if (rand.nextDouble() > 0.4 && rand.nextDouble() < 0.8){
                    comfort--;
                    heated++;
                    JOptionPane.showMessageDialog(new JFrame(), "She gets angrier...",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();

                }
                else if (heated > 1 || rand.nextDouble() > 0.7) {
                    JOptionPane.showMessageDialog(new JFrame(), "She's calling the cops!",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();
                    dispose();
                    System.exit(0);

                }
            }
        });
        correctThemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);
                Random rand = new Random();
                if ((rand.nextDouble() < 0.5 || comfort > 2) && heated < 2) {
                    comfort = comfort + 2;
                    heated--;
                    if (comfort > 2) {
                        JOptionPane.showMessageDialog(new JFrame(), "She cools down a little",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                    }
                } else if (rand.nextDouble() > 0.4 && rand.nextDouble() < 0.8){
                    comfort = comfort - 2;
                    heated++;
                    JOptionPane.showMessageDialog(new JFrame(), "She gets even angrier...",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();

                }
                else if (heated > 1 || rand.nextDouble() > 0.7 ) {
                    JOptionPane.showMessageDialog(new JFrame(), "She's calling the cops!",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();
                    dispose();
                    System.exit(0);

                }
            }
        });
        levelRecoverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);
                Random rand = new Random();
                if (rand.nextDouble() < 0.7) {
                    comfort = comfort + 2;
                    heated--;
                    if (comfort > 2) {
                        JOptionPane.showMessageDialog(new JFrame(), "She cools down a little",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                    }
                } else if (rand.nextDouble() > 0.4 && rand.nextDouble() < 0.8){
                    comfort = comfort - 2;
                    heated++;
                    JOptionPane.showMessageDialog(new JFrame(), "She gets even angrier...",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();

                }
                else if (heated > 1 || rand.nextDouble() > 0.7 ) {
                    JOptionPane.showMessageDialog(new JFrame(), "She's calling the cops!",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();
                    dispose();
                    System.exit(0);

                }
            }
        });
        resolveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);
                Random rand = new Random();
                if (rand.nextDouble() < 0.7) {
                    comfort = comfort + 2;
                    heated--;
                    if (comfort > 2 && heated < 1) {
                        JOptionPane.showMessageDialog(new JFrame(), "She fincally decides to " +
                                        "drop the whole thing",
                                "Dialog",
                                JOptionPane.INFORMATION_MESSAGE);
                        setTextFieldText();
                        dispose();
                        System.exit(0);
                    }
                } else if (rand.nextDouble() > 0.4 && rand.nextDouble() < 0.8){
                    comfort = comfort - 2;
                    heated++;
                    JOptionPane.showMessageDialog(new JFrame(), "She gets even angrier...",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();

                }
                else if (heated > 1 || rand.nextDouble() > 0.7 ) {
                    JOptionPane.showMessageDialog(new JFrame(), "She's calling the cops!",
                            "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    setTextFieldText();
                    dispose();
                    System.exit(0);

                }
            }
        });
    }
}