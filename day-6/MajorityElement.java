
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
    
    public static int majorityElement(int[] nums) {
        //there are 3 ways to solve this. One is by adding it to a hashmap, then we can optimise it by sorting and not using an additional data structure and finally the optimized one will be the O(N) solution using candidate
        int count = 0, candidate = 0;
        for(int num : nums) {
            if(count == 0) 
                candidate = num;
            if(num == candidate)
                count++;
            else    
                count--;
        }
        return candidate;
    }
}
