package edu.austral.ingsis.math.function;

import java.util.Collections;
import java.util.List;

public class Value implements Function {

  private final Double value;

  public Value(Double value) {
    this.value = value;
  }

  @Override
  public Double solve() {
    return value;
  }

  @Override
  public List<String> getVariables() {
    return Collections.emptyList();
  }

  @Override
  public String print() {
    if (value % 1 == 0) {
      return Integer.toString((int) value.doubleValue());
    }
    return Double.toString(value);
  }
}
