package com.andersen.entity.depInj;

import com.andersen.entity.constructor.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {

    @Value("Jingle")
    private String song;

    @Autowired
    @Qualifier("guitar")
    private  Instrument instrument;

    private int age;

    public Instrumentalist() {
    }

//    Внедрение мелодии
    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

//    Внедрение инструмента
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + " : ");

//        для кенни2
        instrument.play();
//        для кенни
//        System.out.println("Age: " + age);
    }
}
