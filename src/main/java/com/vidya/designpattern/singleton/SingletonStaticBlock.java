package com.vidya.designpattern.singleton;

public class SingletonStaticBlock {

  private static SingletonStaticBlock instance;

  private SingletonStaticBlock() {}

  static {
    try {
      instance = new SingletonStaticBlock();
    } catch (Exception exp) {
      throw new RuntimeException("Unable to create the singleton object.");
    }
  }

  public static SingletonStaticBlock getInstance() {
    return instance;
  }
}
