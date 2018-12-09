package com.andersen.entity.injectCollection;

import com.andersen.entity.constructor.Performer;
import com.andersen.entity.depInj.Instrument;

import java.util.Collection;

public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

//    Внедрение коллекции
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBand() {
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
