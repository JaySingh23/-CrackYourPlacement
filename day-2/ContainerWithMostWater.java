public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    private static int maxArea(int[] arr) {
        int max = 0;
        int left = 0, right = arr.length - 1;
        while(left < right) {
            int area = (right - left) * Math.min(arr[left], arr[right]);
            max = Math.max(max, area);
            if(arr[left] < arr[right])
                left++;
            else if(arr[left] > arr[right])
                right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
    
}
