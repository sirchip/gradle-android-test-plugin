package com.example;

public class ModulusOperation implements Operation {
  @Override public int calculate(int a, int b) {
    return a % b;
  }

  @Override public String name() {
    return "modulus";
  }
}
