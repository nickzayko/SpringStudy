package com.andersen.entity.depInj;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class TigerReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object target, Method method, // Подмена метода
                              Object[] args) throws Throwable {
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}
