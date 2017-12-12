import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    private static final int DEFAULT_TIMEOUT = 2000;

    @Test (expected = IllegalArgumentException.class)
    public void test1_fib_negative_value() {
        Fibonacci.fib(-1);
    }

    @Test
    public void test2_fib_check_return_0() {
        assertEquals(0, Fibonacci.fib(0));
    }

    @Test
    public void test3_fib_check_return_1(){
        assertEquals(1, Fibonacci.fib(1));
    }

    @Test
    public void test4_check_recursion_correctness() {
        assertEquals(5, Fibonacci.fib(5));
        assertEquals(21, Fibonacci.fib(8));
    }

    @Test (timeout = DEFAULT_TIMEOUT)
    public void fib_operation_runtime() {
        Fibonacci.fib(15);  // PASS: Operation completed in 16ms
    }

    @Test (timeout = 6000)
    public void fib_runtime_greater_than_6000ms() {
        Fibonacci.fib(46);  //FAIL: Operation completed in 6s 18ms

    }

}