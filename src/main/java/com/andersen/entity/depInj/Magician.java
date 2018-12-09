package com.andersen.entity.depInj;

import com.andersen.entity.constructor.Performer;

public class Magician implements Performer {

    public Magician() {
    }

    private String magicWords;
    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    @Override
    public void perform() {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents()); // Исследует содержимое ящика
    }

    // внедрение
    private MagicBox magicBox;
    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox; // Внедрение волшебного ящика
    }

}
