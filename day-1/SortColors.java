import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int arr[] = {1,0,0,2,0,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortColors(int[] arr) {
        int left = 0, mid = 0, high = arr.length - 1;
        while(left<=high) {
            if(arr[left] == 0) 
                swap(arr, left++, mid++);
            else if(arr[left] == 1)
                left++;
            else
                swap(arr, left, high--);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   
}
