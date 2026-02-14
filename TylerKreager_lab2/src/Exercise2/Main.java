package Exercise2;

public class Main {
    public static void main(String[] args) {
        int n = 1000;
        final int trials = 10;
        double[] data;

        System.out.println("Testing prefix avg 1!");
        for (int i = 0; i < trials; i++){
            data = buildArray(n);
            long startTime = System.currentTimeMillis();
            PrefixAverage.prefixAverage1(data);
            long endTime = System.currentTimeMillis();
            long totalTime = (endTime - startTime);

            System.out.println("n = " + n + " ====== " + " Took: " + totalTime + " ms");
            n *= 2;
        }
        /*n = 1000 ======  Took: 2 ms
                n = 2000 ======  Took: 1 ms
                n = 4000 ======  Took: 5 ms
                n = 8000 ======  Took: 14 ms
                n = 16000 ======  Took: 54 ms
                n = 32000 ======  Took: 221 ms
                n = 64000 ======  Took: 862 ms
                n = 128000 ======  Took: 3444 ms
                n = 256000 ======  Took: 13745 ms
                n = 512000 ======  Took: 55033 ms
        Testing prefix avg 2!
                n = 1000 ======  Took: 0 ms
                n = 2000 ======  Took: 0 ms
                n = 4000 ======  Took: 0 ms
                n = 8000 ======  Took: 0 ms
                n = 16000 ======  Took: 0 ms
                n = 32000 ======  Took: 2 ms
                n = 64000 ======  Took: 0 ms
                n = 128000 ======  Took: 0 ms
                n = 256000 ======  Took: 0 ms
                n = 512000 ======  Took: 2 ms*/
        n = 1000;
        System.out.println("Testing prefix avg 2!");
        for (int i = 0; i < trials; i++){
            data = buildArray(n);

            long startTime = System.currentTimeMillis();
            PrefixAverage.prefixAverage2(data);
            long endTime = System.currentTimeMillis();
            long totalTime = (endTime - startTime);

            System.out.println("n = " + n + " ====== " + " Took: " + totalTime + " ms");
            n *= 2;

        }

    }

    public static double[] buildArray(int n){
        double[] data = new double[n];
        double increment = 0;

        for (int i = 0; i < n; i++){
            data[i] = increment;
            increment += 0.1;
        }
        return data;
    }
}