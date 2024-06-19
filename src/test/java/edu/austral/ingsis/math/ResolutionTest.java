package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.function.Addition;
import edu.austral.ingsis.math.function.Function;
import edu.austral.ingsis.math.function.Value;
import org.junit.jupiter.api.Test;

public class ResolutionTest {

  /** Case 1 + 6 */
  @Test
  public void shouldResolveSimpleFunction1() {
    Function function = new Addition(new Value(1d), new Value(6d));

    final Double result = function.solve();

    assertThat(result, equalTo(7d));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldResolveSimpleFunction2() {
    Function function = new edu.austral.ingsis.math.function.Division(new Value(12d), new Value(2d));
    final Double result = function.solve();

    assertThat(result, equalTo(6d));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldResolveSimpleFunction3() {
    Function function =
        new edu.austral.ingsis.math.function.Multiplication(
            new edu.austral.ingsis.math.function.Division(new Value(9d), new Value(2d)),
            new Value(3d));

    final Double result =  function.solve();

    assertThat(result, equalTo(13.5d));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldResolveSimpleFunction4() {
    Function function =
        new edu.austral.ingsis.math.function.Power(
            new edu.austral.ingsis.math.function.Division(new Value(27d), new Value(6d)),
            new Value(2d));

    final Double result = function.solve();

    assertThat(result, equalTo(20.25d));
  }

  /** Case 36 ^ (1/2) */
  @Test
  public void shouldResolveSimpleFunction5() {
    Function function =
        new edu.austral.ingsis.math.function.Power(new Value(36d), new edu.austral.ingsis.math.function.Division(new Value(1d), new Value(2d)));
    final Double result = function.solve();

    assertThat(result, equalTo(6d));
  }

  /** Case |136| */
  @Test
  public void shouldResolveSimpleFunction6() {
    Function function = new edu.austral.ingsis.math.function.Module(new Value(136d));
    final Double result = function.solve();

    assertThat(result, equalTo(136d));
  }

  /** Case |-136| */
  @Test
  public void shouldResolveSimpleFunction7() {
    Function function = new edu.austral.ingsis.math.function.Module(new Value(-136d));
    final Double result = function.solve();

    assertThat(result, equalTo(136d));
  }

  /** Case (5 - 5) * 8 */
  @Test
  public void shouldResolveSimpleFunction8() {
    Function function =
        new edu.austral.ingsis.math.function.Multiplication(
            new edu.austral.ingsis.math.function.Subtraction(new Value(5d), new Value(5d)),
            new Value(8d));
    final Double result = function.solve();

    assertThat(result, equalTo(0d));
  }
}
