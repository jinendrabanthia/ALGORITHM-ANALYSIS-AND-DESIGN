import java.util.Arrays;

public class MinMaxDifference {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 12, 3};

        Arrays.sort(arr);

        // Minimum difference
        int minDiff = Integer.MAX_VALUE;
        int minA = 0, minB = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];

            if (diff < minDiff) {
                minDiff = diff;
                minA = arr[i];
                minB = arr[i + 1];
            }
        }

        // Maximum difference
        int maxA = arr[0];
        int maxB = arr[arr.length - 1];
        int maxDiff = maxB - maxA;

        System.out.println("Minimum difference pair: "
                + minA + " and " + minB);

        System.out.println("Minimum difference: " + minDiff);

        System.out.println("Maximum difference pair: "
                + maxA + " and " + maxB);

        System.out.println("Maximum difference: " + maxDiff);
    }
}