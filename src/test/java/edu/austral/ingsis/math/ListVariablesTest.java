package edu.austral.ingsis.math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

import java.util.Collections;
import java.util.List;

import edu.austral.ingsis.math.function.*;
import edu.austral.ingsis.math.function.Module;
import edu.austral.ingsis.math.visitor.ListVariablesVisitor;
import edu.austral.ingsis.math.visitor.Visitor;
import org.junit.jupiter.api.Test;

public class ListVariablesTest {


  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {
    Function function = new Addition(new Value(1.), new Value(6.));
    List<String> result = function.getVariables();

    assertThat(result, empty());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {
    Function function = new Division(new Value(12.), new Variable("div", 3.));

    final List<String> result = function.getVariables();

    assertThat(result, containsInAnyOrder("div"));
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {
    Function function = new Multiplication(new Division(new Value(9.), new Variable("x", 3.)), new Variable("y", 3.));
    final List<String> result = function.getVariables();
    assertThat(result, containsInAnyOrder("x", "y"));
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    Function function = new Power(new Division(new Value(27.), new Variable("a", 3.)), new Variable("b", 3.));
    final List<String> result = function.getVariables();

    assertThat(result, containsInAnyOrder("a", "b"));
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {
    Function function = new Power(new Variable("z", 3.), new Division(new Value(1.), new Value(2.)));
    final List<String> result = function.getVariables();

    assertThat(result, containsInAnyOrder("z"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction6() {
    Function function = new Subtraction(new Module(new Variable("value", 3.)), new Value(8.));
    final List<String> result = function.getVariables();

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction7() {
    Function function = new Subtraction(new Module(new Variable("value", 3.)), new Value(8.));
    final List<String> result = function.getVariables();

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldListVariablesFunction8() {
    Function function = new Multiplication(new Subtraction(new Value(5.), new Variable("i", 3.)), new Value(8.));
    final List<String> result = function.getVariables();
    assertThat(result, containsInAnyOrder("i"));
  }
}
