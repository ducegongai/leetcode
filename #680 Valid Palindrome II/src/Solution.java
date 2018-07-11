class Solution {
    public boolean validPalindrome(String s) {
        int way = 0,i = 0, j = s.length()-1;
        int left = 0,right = s.length()-1;
        do {
            if(s.charAt(i)!= s.charAt(j)&&way==2 ){
                return false;
            }
            else if(s.charAt(i)!= s.charAt(j)&&way==1 ){
                i = left;
                j = right-1;
                way = 2;
                System.out.println("way = 2");
            }
            else if(s.charAt(i)!= s.charAt(j)&&way == 0){
                left = i;
                right = j;
                way = 1;
                i++;
                System.out.println("way = 1");
            }
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
        }while(i<j);
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        Solution solution = new Solution();
        boolean res = solution.validPalindrome(s);
        System.out.println(res);

    }
}