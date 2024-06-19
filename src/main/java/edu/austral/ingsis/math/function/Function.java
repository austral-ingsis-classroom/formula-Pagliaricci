package edu.austral.ingsis.math.function;

import java.util.List;

public interface Function {

  Double solve();

  List<String> getVariables();

  String print();
}
