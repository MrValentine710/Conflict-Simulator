package Content;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMenu extends JFrame{
    public JButton startBtn;
    public JPanel MenuPanel;
    public JButton quitBtn;

    public Karen newKaren;

    public GameMenu() {

        setTitle("Conflict Sim");
        setContentPane(MenuPanel);
        setMinimumSize(new Dimension(400, 400));
        setVisible(true);

        String filepath2 = "src/Content/ClickSound.wav";
        ClickSound clickSound = new ClickSound();

        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);
                newKaren = new Karen();
                newKaren.setVisible(true);
                dispose();
            }
        });
        quitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickSound.playButtonClick(filepath2);
                dispose();
                System. exit(0);
            }
        });
    }
}
