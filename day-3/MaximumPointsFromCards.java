public class MaximumPointsFromCards {
    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }
    
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total_sum = 0;
        for(int card : cardPoints)
            total_sum += card;
        if(k == cardPoints.length)
            return total_sum;

        int window_sum = 0;
        for(int i = 0; i < n-k; i++)
            window_sum += cardPoints[i];
        
        int min = window_sum;
        for(int i = n-k; i < n; i++) {
            window_sum += cardPoints[i] - cardPoints[i-(n-k)];
            min = Math.min(min, window_sum);
        }
        return total_sum - min;
    }
}
