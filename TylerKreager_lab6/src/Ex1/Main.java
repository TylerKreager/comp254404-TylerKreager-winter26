package Ex1;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        int numKeys = 500_000;
        int[] theKeys = loadArray(numKeys);

        ArrayList<Double> loadFactors = loadLoadFactors();

        for (double factor : loadFactors) {
            System.out.println("\n==============================");
            System.out.println("   Testing load factor = " + factor);
            System.out.println("==============================");

            testMap("ChainHashMap", new ChainHashMap<>(17, 109345121, factor), theKeys);

        }
    }
    public static ArrayList<Double> loadLoadFactors(){
        ArrayList<Double> loadFactors = new ArrayList<>();
        double val = 0.25;

        while (val <= 1){
            loadFactors.add(val);
            val += 0.25;
        }
        return loadFactors;
    }
    public static int[] loadArray(int numKeys){
        int[] theKeys = new int[numKeys];

        Random rand = new Random();

        for (int i = 0; i <numKeys; i++){
            theKeys[i] = rand.nextInt();
        }
        return theKeys;
}
    private static void testMap(String name, ChainHashMap<Integer, String> map, int[] theKeys){
        long start = System.currentTimeMillis();

        for (int k : theKeys) {
            String s = UUID.randomUUID().toString();
            map.put(k, s);
        }
        long end = System.currentTimeMillis();

        long time = end - start;

        System.out.print(name + ": " + time + " Milliseconds\n");
    }

}
