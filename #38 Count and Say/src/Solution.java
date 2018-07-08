class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n ; i++) {
            int count = 1;
            String temp = "";
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(j)==s.charAt(j-1)){
                    count++;
                }
                else{
                    temp = temp + (char)(count+'0') + s.charAt(j-1);
                    count = 1;
                }
            }
            s = temp +(char)(count+'0')+ s.charAt(s.length()-1);
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 4;
        Solution solution = new Solution();
        String string = solution.countAndSay(n);
        System.out.println(string);
    }
}