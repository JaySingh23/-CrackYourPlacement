import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }

    private static int subarraySum(int[] arr, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1); //for the case when the sum == k
        for(int num : arr) {
            sum += num;
            if(hm.containsKey(sum - k))
                count += hm.get(sum - k);
            hm.put(sum, hm.getOrDefault(hm, 0) + 1);
        }
        return count;
    }
}
