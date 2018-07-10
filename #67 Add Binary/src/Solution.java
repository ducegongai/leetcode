class Solution {
    public String addBinary(String a, String b) {
    int maxLen = Math.max(a.length(),b.length());
    StringBuilder sb = new StringBuilder();
    int carry = 0;
        for (int i = 0; i < maxLen; i++) {
            int tempA = i<a.length()? a.charAt(a.length()-i-1)-'0':0;
            int tempB = i<b.length()? b.charAt(b.length()-i-1)-'0':0;
            sb.insert(0,(tempA+tempB+carry)%2);
            carry = (carry+tempA+tempB)>1?1:0;
        }
        if(carry==1){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}