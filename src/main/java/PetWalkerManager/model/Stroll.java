package PetWalkerManager.model;

import java.time.LocalTime;
import java.time.Duration;

public class Stroll {
    private LocalTime time;
    private Duration duration;

    public Stroll(){

    }
    public Stroll(LocalTime time, Duration duration) {
        this.time = time;
        this.duration = duration;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
