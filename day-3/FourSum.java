import java.util.*;

public class FourSum {
    public static void main(String[] args) {

        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        System.out.println(fourSum(arr, target));
    }
    
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-3; i++) {
            if(i > 0 && arr[i] == arr[i-1])
                continue;
            for(int j = i+1; j<arr.length - 2; j++) {
                if(j > i+1 && arr[j] == arr[j-1])
                    continue;
                int k = j + 1;
                int l = arr.length - 1;
                while(k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum == target) {
                        ans.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        while(k < l && arr[k] == arr[k-1])
                            k++;
                        while(k < l && arr[l] == arr[l+1])
                            l--;
                    }
                    else if(sum < target)
                        k++;
                    else
                        l--;
                }
            }
        }
        return ans;
    }
}

