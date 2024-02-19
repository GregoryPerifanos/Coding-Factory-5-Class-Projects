package gr.aueb.cf.ch6;

/**
 * Reducing Demo
 */
public class ReducingApp {
    public static void main(String[] args) {

    }

    /**
     * Returns the sum of all elements
     * of the array.
     *
     * @param arr   the source array.
     * @return      the aggregate
     */
    public static int getTotal(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        return total;
    }

    public static double getAverage (int[] arr){
        if (arr == null) return 0.0;
        if (arr.length == 0) return 0.0;


        return getTotal(arr) / (double) arr.length;
    }
}
