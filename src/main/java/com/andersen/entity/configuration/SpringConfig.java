package com.andersen.entity.configuration;

import com.andersen.entity.constructor.*;
import com.andersen.entity.depInj.Instrumentalist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//    создание бинов, название методов - это и будет название созданных бинов!!!

    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }



//    @Bean
//    public Performer kenny() {
//        Instrumentalist kenny = new Instrumentalist();
//        kenny.setSong("Jingle Bells");
//        return kenny;
//    }

    @Bean
    Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }

}
