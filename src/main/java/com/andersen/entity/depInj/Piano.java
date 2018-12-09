package com.andersen.entity.depInj;

public class Piano implements Instrument {

    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("Plink plink plink");
    }
}
