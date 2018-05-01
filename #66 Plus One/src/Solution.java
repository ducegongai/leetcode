import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int[] res;
        int[] rev2;
        int length = digits.length, cf = 0;
        int[] rev  = new int[digits.length];
        ArrayList<Integer> rev_array = new  ArrayList<Integer>();
        /*if (digits.length == 1)
            return digits;*/
        for (int i = 0; i < digits.length; i++) {/*原数组转置*/
            rev[i] = digits[digits.length-1-i];
        }
        for (int b: rev
             ) {
            System.out.print(b+" ");
        }
        System.out.println();
        rev[0] = rev[0]+1;
        for (int i = 0; i < rev.length; i++) {
            if(i == rev.length-1){
                if(rev[i]/10 == 1)
                    cf = 1;
            }
            if(rev[i]/10 == 1&& i != rev.length-1)
                rev[i+1] = rev[i+1] + 1;
            rev[i] = rev[i]%10;
        }
        for (int i = 0; i < length; i++) {
            rev_array.add(rev[i]);
        }
        if(cf == 1)
            rev_array.add(1);
        Integer[] rev1 = new  Integer[rev_array.size()];
        rev1 = (Integer[])rev_array.toArray(rev1);//容器转为数组 依然为转置

        //res = new int[rev_array.size()];
        //res = Arrays.stream(rev1).mapToInt(Integer::valueOf).toArray();//Integer数组转为int数组
        res = new int[rev1.length];
        rev2 = new int[rev1.length];
        for (int i = 0; i < rev1.length ; i++) {
            rev2[i] = rev1[rev1.length-1-i];
        }
        res = rev2;

        return res;
    }

    public static void main(String[] args) {
        int[] digits = {9,9};
        Solution solution = new Solution();
        int[] res = solution.plusOne(digits);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }


}