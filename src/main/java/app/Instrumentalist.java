package app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    private String song;
    private int age;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public int getAge() {
        return age;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("PLaying " + song + ": ");
        getInstrument().play();
    }

    public String screamSong() {
        return song;
    }
}
