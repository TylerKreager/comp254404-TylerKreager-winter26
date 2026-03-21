package Ex2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();

        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);



        Stack<Integer> stack2 = new Stack<>();

        System.out.println("\nOriginal stack");
        System.out.println(StackTransfer.printStack(stack1));

        System.out.println("\nFlipped stack");
        StackTransfer.transfer(stack1, stack2);

        System.out.println(stack2);

    }


}
