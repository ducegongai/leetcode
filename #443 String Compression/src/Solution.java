class Solution {
    public int compress(char[] chars) {
        if(chars.length==0)
            return 0;
        int count = 1;
        String res ="";
        for (int i = 1; i < chars.length; i++) {
            if(chars[i]==chars[i-1])
                count++;
            else if(count>1){
                res = res + chars[i-1]+count;
                count=1;
            }
            else{
                res = res +chars[i-1];
                count = 1;
            }
        }
        if(count>1){
            res = res + chars[chars.length-1]+count;
        }
        else{
            res = res + chars[chars.length-1];
        }
        char[] tmp = new char[res.length()];
        tmp = res.toCharArray();
        for (int i = 0; i < res.length(); i++) {
            chars[i] = tmp[i];
        }
        return res.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','b','b','b','b','b','b','b','b','b'};
        //char[] chars = {'a'};
        //char[] chars = {'a','a','b','b','c','c','c'};
        Solution solution = new Solution();
        int res = solution.compress(chars);
        //System.out.println(chars);
    }
}