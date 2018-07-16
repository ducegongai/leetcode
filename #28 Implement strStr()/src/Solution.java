class Solution {
    public int strStr(String haystack, String needle) {
        int i =0;
        if(needle.length()==0)
            return 0;
        if(!haystack.contains(needle)){
            return -1;
        }

        else{
            while(i< haystack.length()-needle.length()+1){
                if(haystack.charAt(i)==needle.charAt(0)){
                    for (int j = 1; j < needle.length()+1; j++) {
                        if(j==needle.length())
                            return i;
                        if(haystack.charAt(i+j)!=needle.charAt(j)){
                            System.out.println("break"+j);
                            break;
                        }
                    }
                }
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "ducegongaibuz";
        String needle = "";
        Solution solution = new Solution();
        int res = solution.strStr(haystack,needle);
        System.out.println(res);
    }
}