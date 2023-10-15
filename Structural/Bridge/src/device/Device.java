package device;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    float getVolume();

    void setVolume(float volume);

    int getChannel();

    void setChannel(int channel);

    void logStatus();
}
