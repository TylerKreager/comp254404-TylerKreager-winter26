package Ex2;

import java.util.Stack;

public class StackTransfer {

    public static <E> void transfer(Stack<E> S, Stack<E> T){

        if (!S.empty()){
            T.push(S.pop());
            transfer(S, T);
        }
    }


    public static <E> String printStack(Stack<E> S){

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < S.size(); i++) {
            sb.append(S.get(i));
            if (i < S.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
