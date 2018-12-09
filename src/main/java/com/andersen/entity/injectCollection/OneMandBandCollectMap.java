package com.andersen.entity.injectCollection;

import com.andersen.entity.constructor.Performer;
import com.andersen.entity.depInj.Instrument;

import java.util.Map;

public class OneMandBandCollectMap implements Performer {

    private Map<String, Instrument> instruments;

    public OneMandBandCollectMap() {
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;  // внедрение инструментов в видео отображения Map
    }

    @Override
    public void perform() {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
