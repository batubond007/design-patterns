package device;

public class TV implements Device {
    private boolean enabled = false;
    private float volume = 0;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public float getVolume() {
        return volume;
    }

    @Override
    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void logStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV.");
        System.out.println("| I'm " + (enabled ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume * 100 + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
