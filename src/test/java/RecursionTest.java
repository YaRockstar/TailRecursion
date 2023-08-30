import org.example.Recursion;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTest {
    @Test
    public void TestIterativeFactorial() {
        assertEquals(Recursion.iterativeFactorial(0), 1);
        assertEquals(Recursion.iterativeFactorial(1), 1);
        assertEquals(Recursion.iterativeFactorial(5), 120);
        assertEquals(Recursion.iterativeFactorial(10), 3628800);
    }

    @Test
    public void TestRecursiveFactorial() {
        assertEquals(Recursion.recursiveFactorial(0), 1);
        assertEquals(Recursion.recursiveFactorial(1), 1);
        assertEquals(Recursion.recursiveFactorial(5), 120);
        assertEquals(Recursion.recursiveFactorial(10), 3628800);
    }

    @Test
    public void TestTailRecursiveFactorial() {
        assertEquals(Recursion.tailRecursiveFactorial(0), 1);
        assertEquals(Recursion.tailRecursiveFactorial(1), 1);
        assertEquals(Recursion.tailRecursiveFactorial(5), 120);
        assertEquals(Recursion.tailRecursiveFactorial(10), 3628800);
    }
}
