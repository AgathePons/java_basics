package learn;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String test = "haannaah";
        boolean otherTest = WordPlay.isPalindromeWord(test);
        System.out.println(otherTest);
        System.out.println("test / estt: " + WordPlay.isAnagram("test", "estt"));
        int number = 5;
        int counter = 10;
        for (int i = 0; i < number; i++) {
            counter += 10;
            System.out.println(counter);
        }
    }
}
