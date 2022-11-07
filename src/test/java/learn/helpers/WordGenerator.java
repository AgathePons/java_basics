package learn.helpers;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class WordGenerator {
    public static Stream<Arguments> generateAnagramWord() {
        return Stream.of(
                Arguments.of("chien", "niche"),
                Arguments.of("arbre", "barre"),
                Arguments.of("abcde", "edcba")
        );
    }

    public static Stream<Arguments> generateNotAnagramWord() {
        return Stream.of(
                Arguments.of("chien", "chats"),
                Arguments.of("arbre", "buisson"),
                Arguments.of("abcde", "abcdd")
        );
    }
}
