package edu.austral.ingsis.math.function;

import edu.austral.ingsis.math.visitor.Visitor;

import java.util.List;

public interface Function {

  Double solve();

  List<String> getVariables();

  String print();
}
