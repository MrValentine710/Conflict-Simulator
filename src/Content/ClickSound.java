package Content;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class ClickSound {
    void playButtonClick(String musicLocation)
    {
        try
        {
            File musicPath = new File(musicLocation);
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

            }
            else
            {
                System.out.println(("Can't find file"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
