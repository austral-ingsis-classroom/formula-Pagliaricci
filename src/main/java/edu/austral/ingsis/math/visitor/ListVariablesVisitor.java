package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.function.*;
import edu.austral.ingsis.math.function.Module;

import java.util.List;

public class ListVariablesVisitor implements Visitor<List<String>>{

  @Override
  public List<String> visit(Addition sum) {
    return sum.getVariables();
  }

  @Override
  public List<String> visit(Constant constant) {
    return constant.getVariables();
  }

  @Override
  public List<String> visit(Division div) {
    return div.getVariables();
  }

  @Override
  public List<String> visit(Module mod) {
    return mod.getVariables();
  }

  @Override
  public List<String> visit(Multiplication mult) {
    return mult.getVariables();
  }

  @Override
  public List<String> visit(Power pow) {
    return pow.getVariables();
  }

  @Override
  public List<String> visit(Sqrt sqrt) {
    return sqrt.getVariables();
  }

  @Override
  public List<String> visit(Subtraction subs) {
    return subs.getVariables();
  }

  @Override
  public List<String> visit(Value val) {
    return val.getVariables();
  }

  @Override
  public List<String> visit(Variable variable) {
    return variable.getVariables();
  }
}
