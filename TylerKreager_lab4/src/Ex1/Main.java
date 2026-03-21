package Ex1;

public class Main {
    public static void main(String[] args) {
        PositionalList<String> list = new LinkedPositionalList<>();

        Position<String> l1 = list.addLast("A");
        Position<String> l2 = list.addLast("B");
        Position<String> l3 = list.addLast("C");
        Position<String> l4 = list.addLast("D");
        Position<String> l5 = list.addLast("E");
        Position<String> l6 = list.addLast("F");
        Position<String> l7 = list.addLast("G");
        Position<String> l8 = list.addLast("H");
        Position<String> l9 = list.addLast("I");

        System.out.println("Index of \"C\": " + list.indexOf(l3));

        Position<String> l10 = list.addBefore(l3, "Z");

        System.out.println("Position of \"C\" after adding \"Z\" before it: " + list.indexOf(l3));



    }
}
