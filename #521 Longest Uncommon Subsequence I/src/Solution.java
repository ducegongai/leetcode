class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;
        if( a.length()>b.length())
            return a.length();
        else if(a.length()<b.length())
            return b.length();
        return a.length();
    }

    public static void main(String[] args) {
        String a = "aaa";
        String b =  "aaa";
        Solution solution = new Solution();
        int result = solution.findLUSlength(a,b);
        System.out.println(result);
    }
}