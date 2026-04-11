package Ex2;

public class Main {
    public static void main(String[] args) {
        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        map.put(11, "Eleven");
        map.put(22, "Twenty-Two");
        map.put(33, "Thirty-Three");

        System.out.println("Contains 11? " + map.containKey(11));
        System.out.println("Contains 22? " + map.containKey(22));

        System.out.println("Contains 44? " + map.containKey(44));

        map.put(29, null);
        System.out.println("Contains 29? " + map.containKey(29));
        System.out.println("Contains value for 29? " + map.get(29));

    }
}
