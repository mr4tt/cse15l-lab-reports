import static org.junit.Assert.*;
import org.junit.*;

import java.util.Arrays;

public class ArrayTests {
	@Test 
	public void testReverseInPlace()
    {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);

        int[] empty = {};
        ArrayExamples.reverseInPlace(empty);
        assertArrayEquals(new int[] {}, empty);

        int[] array = {1, 2, 3, 4};
        ArrayExamples.reverseInPlace(array);
        System.out.println(Arrays.toString(array));

        assertArrayEquals(new int[] {4, 3, 2, 1}, array);
	}


  @Test
  public void testReversed()
  {
      int[] input1 = { };
      assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

      int[] one = {3};
      assertArrayEquals(new int[]{3}, ArrayExamples.reversed(one));
  }
}
