class Solution {
    public String reverseStr(String s, int k) {
        char[] s_array = new char[s.length()];
        s_array = s.toCharArray();
        for(int i =0;i<s_array.length;i=i+2*k){
            if(i+k-1<s_array.length){
                int left = i;
                int right = i+k-1;
                char temp = ' ';
                while(left<right){
                    temp = s_array[left];
                    s_array[left] = s.charAt(right);
                    s_array[right]= temp;
                    left++;
                    right--;
                }
            }
            if(i+k-1>=s_array.length){
                int left = i;
                int right = s_array.length-1;
                char temp = ' ';
                while(left<right){
                    temp = s_array[left];
                    s_array[left] = s.charAt(right);
                    s_array[right]= temp;
                    left++;
                    right--;
                }
            }
        }
        s = String.valueOf(s_array);
        return s;
    }
}