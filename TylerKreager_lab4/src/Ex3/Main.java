package Ex3;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer> q1 = new LinkedQueue<>();
        LinkedQueue<Integer> q2 = new LinkedQueue<>();

        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        q2.enqueue(6);
        q2.enqueue(7);
        q2.enqueue(8);
        q2.enqueue(9);
        q2.enqueue(10);

        System.out.println("\nQ1 before adding Q2");
        System.out.println(q1.toString());

        System.out.println(("\nQ2 before adding to Q1"));
        System.out.println(q2.toString());

        System.out.println("\nAfter adding Q2 to Q1");
        q1.concatenate(q2);
        System.out.println(q1.toString());

        System.out.println(("\nQ2 after adding to Q1"));
        System.out.println(q2.toString());

    }
}
