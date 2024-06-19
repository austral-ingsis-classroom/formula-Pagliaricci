package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.function.*;
import edu.austral.ingsis.math.function.Module;

public class PrintVisitor implements Visitor<String> {
  @Override
  public String visit(Addition sum) {
    return sum.print();
  }

  @Override
  public String visit(Constant constant) {
    return constant.print();
  }

  @Override
  public String visit(Division div) {
    return div.print();
  }

  @Override
  public String visit(Module mod) {
    return mod.print();
  }

  @Override
  public String visit(Multiplication mult) {
    return mult.print();
  }

  @Override
  public String visit(Power pow) {
    return pow.print();
  }

  @Override
  public String visit(Sqrt sqrt) {
    return sqrt.print();
  }

  @Override
  public String visit(Subtraction subs) {
    return subs.print();
  }

  @Override
  public String visit(Value val) {
    return val.print();
  }

  @Override
  public String visit(Variable variable) {
    return variable.print();
  }
}
