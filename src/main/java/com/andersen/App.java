package com.andersen;


import com.andersen.entity.constructor.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("contextBeansConf.xml");

//        Достали компонент
//        Performer performer = (Performer) applicationContext.getBean("theStage");
//        performer.perform();

//        Достали компонент синглтон
//        System.out.println(Stage.getInstance());


//        Instrumentalist instrumentalist = (Instrumentalist) applicationContext.getBean("kenny");
//        instrumentalist.perform();

//        Instrumentalist instrumentalist = (Instrumentalist) applicationContext.getBean("kenny2");
//        instrumentalist.perform();

//        OneManBand instrumentalist = (OneManBand) applicationContext.getBean("hank");
//        instrumentalist.perform();

//        OneMandBandCollectMap instrumentalist = (OneMandBandCollectMap) applicationContext.getBean("hankMap");
//        instrumentalist.perform();

//        OneManBandProperties instrumentalist = (OneManBandProperties) applicationContext.getBean("hankProperties");
//        instrumentalist.perform();

//        Performer instrumentalist = (Performer) applicationContext.getBean("eddie");
//        instrumentalist.perform();


        Performer instrumentalist = (Performer) applicationContext.getBean("duke15");
        instrumentalist.perform();

    }
}
