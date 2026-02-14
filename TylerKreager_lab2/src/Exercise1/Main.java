package Exercise1;

public class Main {
    public static void main(String[] args) {

        int[] no = fillArray();


        //System.out.println(Exercises.example1(no));

        //System.out.println(Exercises.example2(no));


        //long ex3Start = System.nanoTime();
        //int runningEx3 = Exercises.example3(no);
        //long ex3End = System.nanoTime();
        //n = 80000 / ns = 755023600
        //n = 160000 /ns = 3022979000
        //System.out.println("Result: " + runningEx3);
        //System.out.println("Time: " + (ex3End - ex3Start) + " nano seconds");

        //long ex4Start = System.currentTimeMillis();
        //int runningEx4 = Exercises.example4(no);
        //long ex4End = System.currentTimeMillis();

        //System.out.println("Result: " + runningEx4);
        //System.out.println("Time: " + (ex4End - ex4Start) + " ms");

        long ex5Start = System.currentTimeMillis();
        int runningEx5 = Exercises.example5(no, no);
        long ex5End = System.currentTimeMillis();
        //n = 2000 / ms = 1299
        //n = 4000 / ms = 9423
        System.out.println("Result: " + runningEx5);
        System.out.println("Time: " + (ex5End - ex5Start) + " ms");

    }
    public static int[] fillArray(){
        int n = 4000;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }
        return arr;
    }

}