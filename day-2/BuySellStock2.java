public class BuySellStock2 {
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(arr));
    }
    
    private static int maxProfit(int[] arr) {
        int max = 0;
        int start = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(start < arr[i])
                max += arr[i] - start;
            start = arr[i];
        }
        return max;
    }
}
