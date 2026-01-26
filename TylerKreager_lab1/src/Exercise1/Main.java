package Exercise1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> L = new DoublyLinkedList<>();
        L.addFirst("first");
        L.addLast("second");
        L.addLast("third");
        System.out.println("First doublylinked list");
        System.out.println(L);

        DoublyLinkedList<String> M = new DoublyLinkedList<>();
        M.addFirst("Fourth");
        M.addLast("Fifth");
        M.addLast("Sixth");
        System.out.println("Second doublylinked list");
        System.out.println(M);

        System.out.println("Connecting list 'M' to the end of list 'L'");
        L.connectLists(M);
        System.out.println(L);
        }
    }
