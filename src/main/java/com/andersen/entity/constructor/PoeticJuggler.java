package com.andersen.entity.constructor;

public class PoeticJuggler extends Juggler{

    private Poem poem;

//    Внедрение поемы
    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

//    Внедрение количества мячей и поэмы
    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform(){
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
