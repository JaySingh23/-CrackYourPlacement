import java.util.ArrayList;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(arr));
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if(arr[index] < 0)
                ans.add(Math.abs(arr[i]));
            else    
                arr[index] = -arr[index];
        }
        return ans;
    }
}
