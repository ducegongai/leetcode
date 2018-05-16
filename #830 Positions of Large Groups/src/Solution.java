import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        int i = 0 ,j = 0;
        int count = 0;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        char[] s = new char[S.length()];
        s = S.toCharArray();
        while(j<s.length){
            List<Integer> row = new ArrayList<Integer>();
            if(s[i] == s[j]){
                j++;
            }
            if(j>=s.length){
                if(j-i>=3){
                    row.add(i);
                    row.add(j-1);
                    res.add(row);
                }
                break;
            }
            if(s[i]!=s[j]){
                if(j-i>=3){
                    row.add(i);
                    row.add(j-1);
                    res.add(row);
                }
                i = j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String S ="aaa" ;
        Solution solution = new Solution();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res = solution.largeGroupPositions(S);
        for (List a:res
             ) {
            System.out.print(a+" ");
        }
    }
}