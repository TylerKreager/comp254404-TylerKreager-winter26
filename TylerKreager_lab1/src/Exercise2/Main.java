package Exercise2;

public class Main{
    public static void main(String[] args) {

        SinglyLinkedList<String> list = new SinglyLinkedList<String>();

        list.addFirst("all");
        list.addLast("optimization ");
        list.addLast("is");
        list.addLast("the");
        list.addLast("root");
        list.addLast("of");
        list.addLast("Premature");
        list.addLast("evil.");

        System.out.println(list);

        System.out.println("Correcting the quote by Donald Knuth!");
        list.swapNodes("all", "Premature");
        System.out.println(list);

    }
}

