import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListTests {
    @Test
    public void testFilter()
    {
        assertEquals(List.of("string"), ListExamples.filter(List.of("string", "cool"), new IfFourDie()));
    }

    

    @Test
    public void testMerge()
    {
        List<String> input1 = Arrays.asList("a", "c", "e");
        List<String> input2 = Arrays.asList("b", "d", "f");
        List<String> correct = Arrays.asList("a", "b", "c", "d", "e", "f");

        assertEquals(correct, ListExamples.merge(input1, input2));
    }
}
