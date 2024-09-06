public class Main {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();

        // Control Light
        Device light = new Light();
        Command turnOnLight = new TurnOnCommand(light);
        Command turnOffLight = new TurnOffCommand(light);
        
        hub.setCommand(turnOnLight);
        hub.executeCommand();
        
        hub.setCommand(turnOffLight);
        hub.executeCommand();

        // Control Thermostat
        Thermostat thermostat = new Thermostat();
        Command increaseTemp = new IncreaseTemperatureCommand(thermostat);
        Command decreaseTemp = new DecreaseTemperatureCommand(thermostat);
        
        hub.setCommand(increaseTemp);
        hub.executeCommand();
        
        hub.setCommand(decreaseTemp);
        hub.executeCommand();

        // Control Music Player
        MusicPlayer musicPlayer = new MusicPlayer();
        Command playMusic = new PlayMusicCommand(musicPlayer, "Chill Beats");
        Command increaseVolume = new IncreaseVolumeCommand(musicPlayer);
        
        hub.setCommand(playMusic);
        hub.executeCommand();
        
        hub.setCommand(increaseVolume);
        hub.executeCommand();
    }
}
