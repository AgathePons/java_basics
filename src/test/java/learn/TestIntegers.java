package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIntegers {
    @Test
    void testSignedInts() {
        int x = 2000000000; // int signed about between -2 milliards +2 milliards
        // int x = 3000000000;
        System.out.println(x);
        System.out.println(-x);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    void testComputeOverflowModulo() {
        int x = 2000000000;
        int y = x * 2;
        System.out.println(y); //
        x = Integer.MAX_VALUE;
        y = x + 1;
        System.out.println(y);
        // When we compute an overflow value, we loop on the range values of the
        // integer, so Integer.MAX_VALUE + 1 = Integer.MIN_VALUE
    }

    @Test
    void testComputeOverflowError() {
        int x = Integer.MAX_VALUE;
        // int y = Math.addExact(x, 1); // we force to not loop, so it throws an error
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> Math.addExact(x, 1)
        );
        assertEquals("integer overflow", exception.getMessage());
    }
}
