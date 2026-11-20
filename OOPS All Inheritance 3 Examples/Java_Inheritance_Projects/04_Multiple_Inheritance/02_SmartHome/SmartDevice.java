public class SmartDevice implements MusicPlayer, LightControl {
    @Override
    public void playMusic() {
        System.out.println("Music Started");
    }

    @Override
    public void controlLight() {
        System.out.println("Lights Turned ON");
    }
}
