class Solution {
    public boolean checkRecord(String s) {
        int a_count =0;
        if(s.length()==0)
            return false;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='A')
                a_count++;
            if(i+2<s.length()&&s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L')
                return false;
        }
        if(a_count>=2)
            return false;
        return true;
    }
}