package com.vidya.designpattern.singleton;

public class SingletonEagerInitialization {
  private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

  // private constructor to avoid client applications using the constructor
  private SingletonEagerInitialization() {}

  public static SingletonEagerInitialization getInstance() {
    return instance;
  }
}
