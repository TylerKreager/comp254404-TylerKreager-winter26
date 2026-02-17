package Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the numbers you'd like to multiply");

        System.out.print("First number: ");
        int m = MuliplicationByRecursion.gatherInput();

        System.out.println("\nSecond number: ");
        int n = MuliplicationByRecursion.gatherInput();

        System.out.println(m + " * " + n + " = " + MuliplicationByRecursion.MultiplicationLogic(m,n));
    }
}

