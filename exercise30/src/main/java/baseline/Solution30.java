

package baseline;

public class Solution30 {
    public static void main(String[] args) {
        //declare 12x12 2d int array
        int[][] arr = new int[13][13];
        int i, j;
        //for i = 1 to i <= 12
        for (i = 1; i < 13; i++) {
            //for j = 1 to j <= 12
            for (j = 1; j < 13; j++) {
                arr[i][j] = i * j;
                //print arr[i][j]
                System.out.print(arr[i][j] + "   ");
            }
            System.out.print("\n");
        }
    }
}
