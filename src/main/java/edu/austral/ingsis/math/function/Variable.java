package edu.austral.ingsis.math.function;

import edu.austral.ingsis.math.function.Function;

import java.util.List;
import java.util.Map;

public class Variable implements Function {

  private String name;
  private Double value;

    public Variable(String name, Double value) {
        this.name = name;
        this.value = value;
    }

  public void setValue(Double value) {
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
