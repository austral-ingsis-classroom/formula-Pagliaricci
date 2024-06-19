package edu.austral.ingsis.math.function;

import java.util.List;
import java.util.Map;

public class Module implements Function{
  private final Function function;
  public Module(Function function){
    this.function = function;
  }
  @Override
  public Double solve() {
    return Math.abs(function.solve());
  }

  @Override
  public List<String> getVariables() {
    return function.getVariables();
  }

  @Override
  public String print() {
    return "|" + function.print() + "|";
  }
}
