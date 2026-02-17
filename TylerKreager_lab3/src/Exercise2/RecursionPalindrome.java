package Exercise2;

public class RecursionPalindrome {


    public static String palidromeCheck(String word, int i){
        char[] letters = word.toLowerCase().toCharArray();
        if (i >= letters.length / 2){
            return word + " is a palidrome!";
        }
        if (letters[i] == letters[letters.length - 1 - i]) {
            i++;
            return palidromeCheck(word, i);
        }
        return word + " is not a palidrome!";
    }
}
