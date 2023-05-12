import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	// @Test 
	// public void testReverseInPlace() {
  //   int[] input1 = { 3 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 3 }, input1);
	// }


  @Test
  public void testReversed() {
    int[] input1 = { 1 };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  // @Test
  // public void testReverseInPlace2() {
  //   int[] input1 = {1, 2, 3};
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 3, 2, 1 }, input1);

  // }

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  // array with 4 elements and 3 of the lements are 1 and the other one is a 0.

  // @Test
  // public void testAverageWithoutLowest() {
  //   double[] input1 = { 1.0, 1.0, 1.0 };
  //   assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0);
  // }

  // @Test
  // public void testAverageWithoutLowest2() {
  //   double[] input1 = { };
  //   assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
  // }

  // @Test
  // public void testAverageWithoutLowest3() {
  //   double[] input1 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
  //   assertEquals(4.0, ArrayExamples.averageWithoutLowest(input1), 0);
  // }
 
}
