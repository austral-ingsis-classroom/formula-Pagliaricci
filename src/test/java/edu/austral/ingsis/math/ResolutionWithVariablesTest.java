package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.function.*;
import edu.austral.ingsis.math.function.Module;
import org.junit.jupiter.api.Test;

public class ResolutionWithVariablesTest {

  /** Case 1 + x where x = 3 */
  @Test
  public void shouldResolveFunction1() {
    Function func = new Addition(new Value(1d), new Variable("x", 3d));
    final Double result = func.solve();

    assertThat(result, equalTo(4d));
  }

  /** Case 12 / div where div = 4 */
  @Test
  public void shouldResolveFunction2() {
    Function func = new Division(new Value(12d), new Variable("div", 4d));
    final Double result = func.solve();

    assertThat(result, equalTo(3d));
  }

  /** Case (9 / x) * y where x = 3 and y = 4 */
  @Test
  public void shouldResolveFunction3() {
    Function func =
        new Multiplication(
            new Division(new Value(9d), new Variable("x", 3d)), new Variable("y", 4d));
    final Double result = func.solve();

    assertThat(result, equalTo(12d));
  }

  /** Case (27 / a) ^ b where a = 9 and b = 3 */
  @Test
  public void shouldResolveFunction4() {
    Function func =
        new Power(new Division(new Value(27d), new Variable("a", 9d)), new Variable("b", 3d));
    final Double result = func.solve();

    assertThat(result, equalTo(27d));
  }

  /** Case z ^ (1/2) where z = 36 */
  @Test
  public void shouldResolveFunction5() {
    Function func = new Power(new Variable("z", 36d), new Value(0.5d));
    final Double result = func.solve();

    assertThat(result, equalTo(6d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction6() {
    Function func = new Subtraction(new Module(new Value(8d)), new Value(8d));
    final Double result = func.solve();

    assertThat(result, equalTo(0d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction7() {
    Function func = new Subtraction(new Module(new Value(8d)), new Value(8d));
    final Double result = func.solve();

    assertThat(result, equalTo(0d));
  }

  /** Case (5 - i) * 8 where i = 2 */
  @Test
  public void shouldResolveFunction8() {
    Function func = new Multiplication(new Subtraction(new Value(5d), new Variable("i", 2d)), new Value(8d));
    final Double result = func.solve();

    assertThat(result, equalTo(24d));
  }
}
