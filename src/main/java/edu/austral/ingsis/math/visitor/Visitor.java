package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.function.*;
import edu.austral.ingsis.math.function.Module;
import edu.austral.ingsis.math.function.Variable;

public interface Visitor<T> {

  T visit(Addition sum);
  T visit (Constant constant);
  T visit (Division div);
  T visit (Module mod);
  T visit (Multiplication mult);
  T visit (Power pow);
  T visit (Sqrt sqrt);
  T visit (Subtraction subs);
  T visit(Value val);
  T visit(Variable variable);


}
