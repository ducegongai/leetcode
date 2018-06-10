class Solution {
    public int firstUniqChar(String s) {
        if(s.length()<1)
            return -1;
        if(s.length()<2)
            return 0;
        boolean flg = true;
        for(int i = 0;i < s.length();i++){
            flg = true;
            for(int j = 0; j < s.length();j++){
                if(s.charAt(j) == s.charAt(i)&&j!=i){
                    flg = false;
                    break;
                }
            }
            if(flg == true)
                return i;
        }
        return -1;
    }
}