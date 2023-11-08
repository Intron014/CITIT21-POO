package PetWalkerManager;

import java.time.LocalTime;

public class Stroll {
    private LocalTime time;
    private int duration;

    public Stroll(){

    }
    public Stroll(LocalTime time, int duration) {
        this.time = time;
        this.duration = duration;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
