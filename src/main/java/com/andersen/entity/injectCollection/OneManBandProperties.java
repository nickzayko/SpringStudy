package com.andersen.entity.injectCollection;

import com.andersen.entity.constructor.Performer;
import com.andersen.entity.depInj.Instrument;

import java.util.Properties;

public class OneManBandProperties implements Performer {

    private Properties instruments;

    public OneManBandProperties() {
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() {
        for (Object key : instruments.keySet()) {
            System.out.println(key +" : " + instruments.getProperty(String.valueOf(key)));
        }
    }
}
