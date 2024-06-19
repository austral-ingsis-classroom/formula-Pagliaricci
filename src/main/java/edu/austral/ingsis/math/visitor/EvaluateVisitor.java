package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.function.*;
import edu.austral.ingsis.math.function.Module;

public class EvaluateVisitor implements Visitor<Double> {
  @Override
  public Double visit(Addition sum) {
    return sum.solve();
  }

  @Override
  public Double visit(Constant constant) {
    return constant.solve();
  }

  @Override
  public Double visit(Division div) {
    return div.solve();
  }

  @Override
  public Double visit(Module mod) {
    return mod.solve();
  }

  @Override
  public Double visit(Multiplication mult) {
    return mult.solve();
  }

  @Override
  public Double visit(Power pow) {
    return pow.solve();
  }

  @Override
  public Double visit(Sqrt sqrt) {
    return sqrt.solve();
  }

  @Override
  public Double visit(Subtraction subs) {
    return subs.solve();
  }

  @Override
  public Double visit(Value val) {
    return val.solve();
  }

  @Override
  public Double visit(Variable variable) {
    return variable.solve();
  }
}
