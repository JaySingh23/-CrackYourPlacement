import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i<arr.length; i++) {
            if(hm.containsKey(target - arr[i])) {
                ans[0] = i;
                ans[1] = hm.get(target - arr[i]);
            }
            hm.put(arr[i], i);
        }
        return ans;
    }
}