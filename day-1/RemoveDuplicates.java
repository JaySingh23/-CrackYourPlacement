public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3};
        int val = removeDuplicates(arr);
        System.out.println(val);
    }
    
    private static int removeDuplicates(int[] arr) {
        int count = 1, c = 1;
        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                count++;
                arr[c++] = arr[i+1];
            }
        }
        return count;
    }
}
