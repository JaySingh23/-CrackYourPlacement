public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        int val = findDuplicate(arr);
        System.out.println(val);
    }

    private static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while(slow!=fast);

        slow = arr[0];
        while(slow!=fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}