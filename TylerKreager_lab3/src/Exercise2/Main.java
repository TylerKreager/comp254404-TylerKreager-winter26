package Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the word you think is a palidrome. \nWord: ");

        String word = input.next();

        System.out.println("\n" + RecursionPalindrome.palidromeCheck(word, 0));
    }
}
