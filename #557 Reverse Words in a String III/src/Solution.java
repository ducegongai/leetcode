import java.lang.reflect.Array;

class Solution {
    public String reverseWords(String s) {
        Solution solution = new Solution();
        char[] string;
        string = s.toCharArray();
        int len = string.length;
        int left = 0, right = 0;
        for (left = 0,right = 0; right < len; right++) {
            if (right == len - 1) {
                char temp;
                for (int i = left,j = right;i <j ; i++,j--) {
                    temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                }
            }
            if (string[right] == ' ') {
                char temp;
                for (int i = left,j = right-1;i < j; i++,j--) {
                    temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                }
                left = right + 1;
                right = left;
            }
        }
        s = String.valueOf(string);
        return s;
    }

    public static void main(String[] args) {
        String s ="Let's take LeetCode contest";
        Solution solution = new Solution();
        String res = solution.reverseWords(s);
        System.out.println(res);
    }


}
