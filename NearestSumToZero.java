import java.util.Arrays;

public class NearestSumToZero {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};

        // Sort the array
        Arrays.sort(arr);
        
        // Initialize variables to store the closest pair
        int left = 0;
        int right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int closestPairLeft = left;
        int closestPairRight = right;

        // Use two pointers technique to find the closest pair
        while (left < right) {
            int sum = arr[left] + arr[right];

            // If the sum is closer to zero, update the closest pair
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                closestPairLeft = left;
                closestPairRight = right;
            }

            // Move pointers based on the current sum
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        // Output the closest pair
        System.out.println("The two elements whose sum is closest to zero are: " + arr[closestPairLeft] + ", " + arr[closestPairRight]);
    }
}