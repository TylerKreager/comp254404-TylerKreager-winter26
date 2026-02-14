package Exercise1;

class Exercises {

    /** Returns the sum of the integers in given array. */

    /** Example1 - has linear growth that depends on the size of n. Say the size of "n" was 1
     * resources to run the method would be minimal. But as n grows so does the demand for resources.
     * The Big-O notations that best represents this method is O(n).
     * */

    public static int example1(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j++)       // loop from 0 to n-1
            total += arr[j];
        return total;
    }

    /** Returns the sum of the integers with even index in given array. */
    /** Example2 - has constant linear growth as n grows just like like Ex1. Difference is the incrementation
     * of j which causes it to only process 1/2 the array that doesn't change the fact that the
     * Big-O notation that best represents this method is O(n)
     * */

    public static int example2(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j += 2)    // note the increment of 2
            total += arr[j];
        return total;
    }

    /** Returns the sum of the prefix sums of given array. */
    /** Example3 - has quatratic growth due to as n grows so does j from the outer loop
     * which is used as a comparison in the inner loop to add arr[j] to total until k <= j
     * this has time grow in a quadratic way.
     * Big-O notation is O(n^2)
     * */
    public static int example3(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j++)       // loop from 0 to n-1
            for (int k=0; k <= j; k++)    // loop from 0 to j
                total += arr[j];
        return total;
    }

    /** Returns the sum of the prefix sums of given array. */
    /** Example4 - has linear growth the loop itself is no different than Ex1 or Ex2
     * as it's just a for loop that adds value to a variable. In this case two variables
     * the growth of time with incrimation of n is still linear.
     * Big - O notation is O(n)
     * */
    public static int example4(int[] arr) {
        int n = arr.length, prefix = 0, total = 0;
        for (int j=0; j < n; j++) {     // loop from 0 to n-1
            prefix += arr[j];
            total += prefix;
        }
        return total;
    }

    /** Returns the number of times second array stores sum of prefix sums from first. */
    /** Example5 - growth is cubic? as n grows so do the iterations of the outer loop and the 2 that are nested within.
     *  the growth of n causes a exponential growth in time.
     *  Big - O notation is O(n^3)...if it is cubic.
     * */
    public static int example5(int[] first, int[] second) { // assume equal-length arrays
        int n = first.length, count = 0;
        for (int i=0; i < n; i++) {     // loop from 0 to n-1
            int total = 0;
            for (int j=0; j < n; j++)     // loop from 0 to n-1
                for (int k=0; k <= j; k++)  // loop from 0 to j
                    total += first[k];
            if (second[i] == total) count++;
        }
        return count;
    }

}

