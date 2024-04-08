package Content;

public class Main {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();
        menu.setVisible(true);

        String filepath = "src/Content/Boss.wav";
        musicStuff musicObject = new musicStuff();
        musicObject.playMusic(filepath);
    }
}