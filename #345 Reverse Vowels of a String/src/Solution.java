class Solution {
    public String reverseVowels(String s) {
        char[] s_array = s.toCharArray();
        if(s.length()==0)
            return "";
        char temp = ' ';
        int left = 0, right = s.length() - 1;
        System.out.println(s_array);
        do {
            System.out.println(s_array[left] + " " + s_array[right]);
            while (left < right && s_array[left] != 'a' && s_array[left] != 'e' && s_array[left] != 'i' && s_array[left] != 'o' && s_array[left] != 'u' && s_array[left] != 'A' && s_array[left] != 'E' && s_array[left] != 'I' && s_array[left] != 'O' && s_array[left] != 'U') {
                left++;
            }
            while (right > left && s_array[right] != 'a' && s_array[right] != 'e' && s_array[right] != 'i' && s_array[right] != 'o' && s_array[right] != 'u' && s_array[right] != 'A' && s_array[right] != 'E' && s_array[right] != 'I' && s_array[right] != 'O' && s_array[right] != 'U') {
                right--;
            }
            if(left>=right)
                break;
            else{
                temp = s_array[left];
                s_array[left] = s_array[right];
                s_array[right] = temp;
                System.out.println("reverse once");
                left++;
                right--;
            }
        } while (left < right);


        String res = String.valueOf(s_array);
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        String s = "race a car";
        Solution solution = new Solution();
        String res = solution.reverseVowels(s);
        System.out.println(res);
    }
}
