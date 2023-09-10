package com.vidya.designpattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEagerInitializationTest {


    @Test
    void testSingletonObject(){

        SingletonEagerInitialization instance1 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization instance2 = SingletonEagerInitialization.getInstance();

        assertNotNull(instance1, "instance1 is null");
        assertNotNull(instance2, "instance2 is null");
        assertEquals(instance1, instance2);
    }


}
