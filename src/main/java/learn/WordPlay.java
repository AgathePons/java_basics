package learn;

import java.util.Arrays;

public class WordPlay {
    // class method

    /**
     * verify if a word is a palindrome
     * @param word
     * @return true if a word is a palindrome, false if it is not
     */
    public static boolean isPalindromeWord(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return  false;
            }
        }
        return true;
//        String invertedString = new StringBuilder(word).reverse().toString();
//        String originalString = new StringBuilder(word).toString();
//        System.out.println("word: " + originalString + " - inverted: " + invertedString);
//        if (invertedString == originalString) {
//            System.out.println("in if");
//            return true;
//        } else {
//            System.out.println("in else");
//            return false;
//        }
    }

    /**
     *
     * @param word1
     * @param word2
     * @return
     */
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] letters1 = word1.toCharArray();
        char[] letters2 = word2.toCharArray();
        Arrays.sort(letters1);
        Arrays.sort(letters2);
        return Arrays.equals(letters1, letters2);
    }
}
