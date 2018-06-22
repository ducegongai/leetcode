class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int count = 0;
        int length = 0;
        char[] string =  s.toCharArray();
        char[] temp = new char[s.length()];
        for(int i = 0;i < s.length(); i++){
            count = 0;
            temp[length] = string[i];
            length++;
            for(int j = i+1;j<s.length();j++){
                if(string[j]!=temp[j%length])
                    break;
                count++;
            }
            System.out.println(count+" "+length);
            System.out.println(temp);
            if(count+length == s.length()&&count%length==0&&length!=s.length()){
                return true;

            }


        }
        return false;
    }
    public static void main(String[] args) {
        String s = "aabaaba";
        Solution solution = new Solution();
        boolean res = solution.repeatedSubstringPattern(s);
        System.out.println(res);
    }
}