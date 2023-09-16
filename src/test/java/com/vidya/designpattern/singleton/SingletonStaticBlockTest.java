package com.vidya.designpattern.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class SingletonStaticBlockTest {

  @Test
  void testSingletonObject() {

    SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();
    SingletonStaticBlock instance2 = SingletonStaticBlock.getInstance();

    assertNotNull(instance1, "instance1 is null");
    assertNotNull(instance2, "instance2 is null");
    assertEquals(instance1, instance2);
  }
}
