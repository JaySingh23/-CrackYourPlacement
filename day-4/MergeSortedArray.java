import java.util.Arrays;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //declare the pointers
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int ptr = m + n - 1;

        while (ptr1 >= 0 && ptr2 >= 0) {
            if(nums1[ptr1] > nums2[ptr2]) 
                nums1[ptr--] = nums1[ptr1--];
            else
                nums1[ptr--] = nums2[ptr2--];
        }

        //if elements remain in nums2
        while (ptr2 >= 0) 
            nums1[ptr--] = nums2[ptr2--];
    }
}
