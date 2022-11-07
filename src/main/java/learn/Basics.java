package learn;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String test = "haannaah";
        boolean otherTest = WordPlay.isPalindromeWord(test);
        System.out.println(otherTest);
        System.out.println("test / estt: " + WordPlay.isAnagram("test", "estt"));
    }
}
