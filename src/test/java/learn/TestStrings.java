package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStrings {
    @Test
    void testStringUninitializedVariable() {
        String city; // non initialized
        // System.out.println(city); // forbidden because not initialized
        city = "Toulouse";
        System.out.println(city);
    }

    @Test
    void testStringInitializeVariable() {
        String city = "Toulouse";
        System.out.println(city);
        String message = city + " la ville rose avec " + 470000 + " habitants";
        System.out.println(message);
        System.out.println("Nb de lettres: " + city.length());
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        message += "; il fait beau aujourd'hui";
        System.out.println(message);
        // first character at index 0
        System.out.println(city.substring(4));
        // first included, last excluded
        System.out.println(city.substring(1, 6));
    }

    @Test
    void testStringSubstringOutOfBounds() {
        String city = "Toulouse";
        assertThrows(IndexOutOfBoundsException.class,
                () -> city.substring(9));
    }

    @Test
    void testOperatorEquals() {
        // test ==
        String city1 = "Toulouse";
        String city2 = "Tou" + "louse";
        boolean eq = city1 == city2;
        System.out.println(eq);
        // here we have a false friend:
        // 2 strings are stored as one string in memory
        String city3 = "Toulouse".toLowerCase();
        String city4 = "TOULOusE".toLowerCase();
        boolean eq2 = city3 == city4;
        System.out.println(eq2);
        // 2 identical strings are stored at different @ in memory
    }

    @Test
    void testMethodEquals() {
        String city3 = "Toulouse".toLowerCase();
        String city4 = "TOULOusE".toLowerCase();
        boolean eq = city3.equals(city4);
        System.out.println(eq);
    }
}
