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
        List<String> result = Arrays.asList("soup", "turtle", "shrimp");
        List<String> correct = Arrays.asList("soup", "shrimp");
        //ArrayGL<String> agl = new ArrayGL<String>(stringContent);

        StringChecker.StringChecker()
        assertEquals(correct, ListExamples.filter());
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
