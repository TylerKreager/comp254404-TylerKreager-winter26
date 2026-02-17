package Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MuliplicationByRecursion {

    public static int gatherInput() {
        Scanner input = new Scanner(System.in);
        int number = 0;

        try {
            number = input.nextInt();
            if(number < 0){
                System.out.println("Enter a positive number.");
                return gatherInput();
            }
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
            return gatherInput();
        }
    }

    public static int MultiplicationLogic(int m, int n) {
        n--;
        if (n > 0){
                m += MultiplicationLogic(m, n);
        }

        return m;
    }
}
