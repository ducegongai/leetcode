import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int i,j;
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[0].length; j++) {
                row.add(A[i][j]);
            }
            Collections.reverse(row);
            list.add(row);
            Integer[] row1 = (Integer[])row.toArray(new Integer[row.size()]);
            for (j = 0; j < A[0].length; j++) {
                A[i][j] = row1[j];
            }
        }

        for (int l = 0; l < A.length; l++) {
            for (int m = 0; m < A[0].length; m++) {
                if(A[l][m] == 0)
                    A[l][m] = 1;
                else
                    A[l][m] = 0;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A= {{1,1,0},{1,0,1},{0,0,0}};
        Solution solution = new Solution();
        int[][] res = solution.flipAndInvertImage(A);
        for (int[] i:res
             ) {
            for (int j: i
                 ) {
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
}