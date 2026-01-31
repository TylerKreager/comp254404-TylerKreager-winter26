package Exercise3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CircularlyLinkedList<String> circularList = new CircularlyLinkedList<String>();
        circularList.addFirst("LAX");
        circularList.addLast("MSP");
        circularList.addLast("ATL");
        circularList.addLast("BOS");

        System.out.println(circularList);
        circularList.removeFirst();
        System.out.println(circularList);
        circularList.rotate();
        System.out.println(circularList);

        System.out.println("Cloning");
        CircularlyLinkedList<String> copy = circularList.clone();
        System.out.println("Cloned: " + copy);
    }
}
