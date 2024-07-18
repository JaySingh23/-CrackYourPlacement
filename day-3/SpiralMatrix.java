import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        spiralPrint(arr);
    }

    public static void spiralPrint(int[][] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int rowStart = 0, rowEnd = arr.length - 1;
        int colStart = 0, colEnd = arr[0].length - 1;
        int ch = 0;

        while(rowStart<=rowEnd && colStart<=colEnd) {
            switch (ch) {
                case 0:
                    for(int i = colStart; i<=colEnd; i++)   
                        res.add(arr[rowStart][i]);
                    rowStart++;
                    break;
                case 1:
                    for(int i = rowStart; i<=rowEnd; i++)
                        res.add(arr[i][colEnd]);
                    colEnd--;
                    break;
                case 2:
                    for(int i = colEnd; i>=colStart; i--)
                        res.add(arr[rowEnd][i]);
                    rowEnd--;
                    break;
                case 3:
                    for(int i = rowEnd; i>=rowStart; i--)
                        res.add(arr[i][colStart]);
                    colStart++;
                    break;
                default:
                    break;
            }
            ch = (ch + 1 )%4;
        }

        System.out.println(res);
    }    
}
