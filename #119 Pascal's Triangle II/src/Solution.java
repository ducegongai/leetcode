import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> trian = new ArrayList<List<Integer>>();
        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> row= new ArrayList<Integer>();
            row.add(0,1);
            if(i>1){
                for (int j = 1; j < i; j++) {
                    List<Integer> last = trian.get(i-1);
                    int temp = last.get(j)+last.get(j-1);
                    row.add(j,temp);
                }
            }
            if(i>0)
                row.add(i,1);
            trian.add(i,row);

        }
        return trian.get(rowIndex);
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        Solution solution = new Solution();
        List<Integer> res = solution.getRow(rowIndex);
        for (Object a:res
             ) {
            System.out.print(a+" ");
        }
    }
}