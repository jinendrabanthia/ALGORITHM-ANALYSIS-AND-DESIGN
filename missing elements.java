public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;

        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum = arraySum + arr[i];
        }

        int missingNumber = totalSum - arraySum;

        System.out.println("Missing number is: " + missingNumber);
    }
}