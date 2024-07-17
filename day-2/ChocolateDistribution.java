import java.util.Arrays;
public class ChocolateDistribution {

    public static void main(String[] args) {

        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 5, n = 7;

        System.out.println(getMinDiff(arr, m, n));

    }

    private static int getMinDiff(int[] arr, int m, int n) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //sliding window approach
        for (int i = 0; i+m-1 < n; i++) {
            min = Math.min(min, arr[i+m-1] - arr[i]);
        }
        return min;
    } 
}
