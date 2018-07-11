class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean begin = false;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)!=' '&&begin == false){
                begin = true;
            }
            if(s.charAt(i)!= ' '&&begin == true){
                count++;
            }
            if(s.charAt(i)==' '&&begin == true)
                break;
        }
        return count;
    }
}