package learn;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// IEEE754 => https://fr.wikipedia.org/wiki/IEEE_754
public class TestFloatingNumbers {
    @Test
    void testDoubles() {
        double x = 3.75;
        double y = 1.25D; // we can specify a 'd'/'D'
        double z = 3.1459E38; // with double, we can have exponent until 304
        double w = -3.1459E-38;
        for (double n: List.of(x, y, z, w)) {
            System.out.println(n);
        }
    }

    @Test
    void testComputeOperators() {
        double x = 7.0; // or 7. or 7D
        double y = (x + 3) * 10 / 9 - 1;
        // if the computing have at least one floating number, we can have integers, and it is ok
        System.out.println("y: " + y);
        assertEquals(10.11111, y, 1E-5); // the third argument delta is because we cannot have precise value
    }

    @Test
    void testStrawberriesTagadaDouble() {
        // we cannot manipulate 0.10 in base 2
        // 0.1 in 10 base = is an infinite sequence in base 2 (0.00011001100110011...)
        double price = 0.10;
        for (int i = 1; i <= 3; i++) {
            double totalPrice = i * price;
            System.out.println("total: " + totalPrice);
        }
    }

    @Test
    void testStrawberriesTagadaFloat() {
        float price = 0.10F; // 0.10 is not allowed, we have to specify 'f'/'F'
        for (int i = 1; i <= 3; i++) {
            float totalPrice = i * price;
            System.out.println("total: " + totalPrice); // we loose precision with this display
            System.out.printf("%.8f%n", totalPrice);
        }
    }

    @Test
    void testInfinity() {
        double inf = Double.POSITIVE_INFINITY;
        System.out.println("infinity: " + inf);
        double x = 1E308;
        System.out.println("x: " + x);
        x *= 2;
        System.out.println("x * 2: " + x);
        double z = 1 / inf;
        System.out.println("1 / inf: " + z);
        double w = 1 / 0D;
        System.out.println("1 / 0D: " + w); // => NaN
    }
}
