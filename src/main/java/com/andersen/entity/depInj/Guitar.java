package com.andersen.entity.depInj;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {

    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("Brin Brin Brin");
    }
}
