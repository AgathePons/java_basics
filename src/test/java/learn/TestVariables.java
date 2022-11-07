package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestVariables {
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
}
