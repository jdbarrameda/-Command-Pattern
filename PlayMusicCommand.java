public class PlayMusicCommand implements Command {
    private MusicPlayer musicPlayer;
    private String playlist;

    public PlayMusicCommand(MusicPlayer musicPlayer, String playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic(playlist);
    }
}


