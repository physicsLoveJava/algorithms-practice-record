package books.classic;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void fib() throws Exception {

        assertEquals(0, Fibonacci.fib(0));
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));

    }

}