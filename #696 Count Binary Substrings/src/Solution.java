class Solution {
    public int countBinarySubstrings(String s) {
        int left = 0,right = 0,count = 0;
        if(s.length()==1||s.length()==0)
            return 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(i-1)){
                count++;
                left = i - 1;
                right = i;
                while(right+1<s.length()&&left-1>=0&&s.charAt(left)==s.charAt(left-1)&&s.charAt(right)==s.charAt(right+1)){
                    count++;
                    left--;
                    right++;
                }
            }
        }
        return count;
    }
}