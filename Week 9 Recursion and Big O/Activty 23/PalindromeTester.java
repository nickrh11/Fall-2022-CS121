import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args) {

        PalindromeDetector demo = new PalindromeDetector();

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a word");
        String Word = console.nextLine();
        System.out.println(demo.isThisPalindrome(Word,0));
    }
}
