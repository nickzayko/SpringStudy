package com.andersen.entity.depInj;

public class Saxophone implements Instrument {

    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("Toot toot toot");
    }
}
