import java.util.HashMap;

public class SubArraySumDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        System.out.println(subArraySumDivisibleByK(nums, 5));
    }

    private static int subArraySumDivisibleByK(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % k;
            if(sum < 0)
                sum += k; //to make the sum positive
            count += hm.getOrDefault(sum, 0);
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
