package edu.austral.ingsis.math.function;

import java.util.ArrayList;
import java.util.List;

public class Power implements Function {
  private final Function function1;
  private final Function function2;

  public Power(Function function1, Function function2) {
    this.function1 = function1;
    this.function2 = function2;
  }

  @Override
  public Double solve() {
    return Math.pow(function1.solve(), function2.solve());
  }

  @Override
  public List<String> getVariables() {
    List<String> variables = new ArrayList<>(function1.getVariables());
    variables.addAll(function2.getVariables());
    return variables;
  }

  @Override
  public String print() {
    return "(" + function1.print() + " ^ " + function2.print() + ")";
  }
}
