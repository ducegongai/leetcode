class Solution {
    public String reverseString(String s) {
        char[] b = new char[s.length()];
        char[] a = new char[s.length()];
        String res = new String();
        b = s.toCharArray();
        for (int i = 0,j=s.length()-1; i < s.length(); i++,j--) {
            a[j] = b[i];
        }
        res  = String.valueOf(a);
        return res;
    }

    public static void main(String[] args) {
        String s = "hello";
        Solution solution = new Solution();
        String res = solution.reverseString(s);
        System.out.println(res);
    }

}