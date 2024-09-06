public class MusicPlayer implements Device {
    @Override
    public void turnOn() {
        System.out.println("Music Player is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Music Player is turned OFF");
    }

    public void playMusic(String playlist) {
        System.out.println("Playing playlist: " + playlist);
    }

    public void increaseVolume() {
        System.out.println("Volume increased");
    }

    public void decreaseVolume() {
        System.out.println("Volume decreased");
    }
}
