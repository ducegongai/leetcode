class Solution {
    public boolean detectCapitalUse(String word) {
        char[] temp =new char[word.length()];
        int i = 0;

            if ((int) word.charAt(0) <= 90 && word.length() > 1) {//首字母大写
                if ((int) word.charAt(1) <= 90) {//次字母也大写
                    for (i = 2; i < word.length(); i++){//后续有非大写就false
                        if ((int) word.charAt(i) > 90)
                            return false;
                    }
                }
                if ((int) word.charAt(1) > 90 && word.length() > 1) {//次字母小写
                    for (i = 1; i < word.length(); i++){//后续出现大写就false
                        if ((int) word.charAt(i) <= 90)
                            return false;
                    }
                }
            }
             if ((int) word.charAt(0) > 90) {//首字母小写
                 for (i = 1; i < word.length(); i++){//后续出现大写就false
                     if((int)word.charAt(i)<=90)//有大写就false
                         return false;
                 }
             }
        return true;
    }

    public static void main(String[] args) {
        String word = "mL";
        Solution solution = new Solution();
        boolean res = solution.detectCapitalUse(word);
        System.out.println(res);
    }
}