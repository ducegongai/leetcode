import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows ; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(0,1);
            if(i>1){

                for (int j = 1; j < i; j++) {
                    List<Integer> last = res.get(i-1);
                    int num = last.get(j)+last.get(j-1);
                    row.add(j,num);
                }
            }
            if(i>0)
                row.add(i,1);
                res.add(i,row);
        }
        return res;
    }
}