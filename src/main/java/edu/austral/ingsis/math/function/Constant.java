package edu.austral.ingsis.math.function;

import java.util.List;

public class Constant implements Function {

  private final Double value;
  private final String name;

  public Constant(Double value, String name) {
    this.name = name;
    this.value = value;
  }

  @Override
  public Double solve() {
    return value;
  }

  @Override
  public List<String> getVariables() {
    return List.of(name);
  }

  @Override
  public String print() {
    return name;
  }
}
