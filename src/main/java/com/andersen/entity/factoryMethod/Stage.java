package com.andersen.entity.factoryMethod;

public class Stage {

    public Stage() {
    }

    private static class StageSingletonHolder{
//        создание эземпляра
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance; //возвращает экземпляр
    }

}
