package edu.austral.ingsis.math.function;

import java.util.List;
import java.util.Map;

public class Sqrt implements Function{

    private final Function function;

    public Sqrt(Function function){
        this.function = function;
    }
  @Override
  public Double solve() {
        return Math.sqrt(function.solve());
  }

  @Override
  public List<String> getVariables() {
    return function.getVariables();
  }

  @Override
  public String print() {
        return "sqrt(" + function.print() + ")";
  }
}
