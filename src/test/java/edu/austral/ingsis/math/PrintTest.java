package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.function.*;
import edu.austral.ingsis.math.function.Module;
import edu.austral.ingsis.math.visitor.PrintVisitor;
import org.junit.jupiter.api.Test;

public class PrintTest {
  PrintVisitor visitor = new PrintVisitor();

  /** Case 1 + 6 */
  @Test
  public void shouldPrintFunction1() {
    Addition function = new Addition(new Value(1.), new Value(6.));
    String result = visitor.visit(function);
    final String expected = "(1 + 6)";
    assertThat(result, equalTo(expected));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldPrintFunction2() {
    Division function =
        new edu.austral.ingsis.math.function.Division(new Value(12.), new Value(2.));
    String result = visitor.visit(function);
    final String expected = "(12 / 2)";

    assertThat(result, equalTo(expected));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldPrintFunction3() {
    Multiplication function =
        new edu.austral.ingsis.math.function.Multiplication(
            new edu.austral.ingsis.math.function.Division(new Value(9.), new Value(2.)),
            new Value(3.));
    String result = visitor.visit(function);
    final String expected = "((9 / 2) * 3)";

    assertThat(result, equalTo(expected));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldPrintFunction4() {
    Power function =
        new edu.austral.ingsis.math.function.Power(
            new edu.austral.ingsis.math.function.Division(new Value(27.), new Value(6.)),
            new Value(2.));
    String result = visitor.visit(function);
    final String expected = "((27 / 6) ^ 2)";

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction6() {
    Subtraction function =
        new edu.austral.ingsis.math.function.Subtraction(
            new Module(new Variable("value", 0.)), new Value(8.));
    String result = visitor.visit(function);
    final String expected = "(|value| - 8)";

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction7() {
    Subtraction function =
        new edu.austral.ingsis.math.function.Subtraction(
            new Module(new Variable("value", 0.)), new Value(8.));
    String result = visitor.visit(function);
    final String expected = "(|value| - 8)";

    assertThat(result, equalTo(expected));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldPrintFunction8() {
    Multiplication function =
        new edu.austral.ingsis.math.function.Multiplication(
            new edu.austral.ingsis.math.function.Subtraction(new Value(5.), new Variable("i", 0.)),
            new Value(8.));
    String result = visitor.visit(function);
    final String expected = "((5 - i) * 8)";

    assertThat(result, equalTo(expected));
  }
}
