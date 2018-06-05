class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        if(s.length()==1){
            if(s.charAt(0)=='I'){
                sum = sum + 1;
            }
            else if(s.charAt(0)=='V'){
                sum = sum + 5;
            }
            else if(s.charAt(0)=='X'){
                sum = sum + 10;
            }
            else if(s.charAt(0)=='L'){
                sum = sum + 50;
            }
            else if(s.charAt(0)=='C'){
                sum = sum + 100;
            }
            else if(s.charAt(0)=='D'){
                sum = sum + 500;
            }
            else if(s.charAt(0)=='M'){
                sum = sum + 1000;
            }
            return sum;
        }

        for (int i = 0; i <s.length() ; i++) {
            if(i+1<s.length()&&s.charAt(i)=='I'&&s.charAt(i+1)=='V'){
                i = i+1;
                sum = sum + 4;
            }
            else if(i+1<s.length()&&s.charAt(i)=='I'&&s.charAt(i+1)=='X'){
                i = i+1;
                sum = sum + 9;
            }
            else if(i+1<s.length()&&s.charAt(i)=='X'&&s.charAt(i+1)=='L'){
                i = i+1;
                sum = sum + 40;
            }
            else if(i+1<s.length()&&s.charAt(i)=='X'&&s.charAt(i+1)=='C'){
                i = i+1;
                sum = sum + 90;
            }
            else if(i+1<s.length()&&s.charAt(i)=='C'&&s.charAt(i+1)=='D'){
                i = i+1;
                sum = sum + 400;
            }
            else if(i+1<s.length()&&s.charAt(i)=='C'&&s.charAt(i+1)=='M'){
                i = i+1;
                sum = sum + 900;
            }
            else if(s.charAt(i)=='I'){
                sum = sum + 1;
            }
            else if(s.charAt(i)=='V'){
                sum = sum + 5;
            }
            else if(s.charAt(i)=='X'){
                sum = sum + 10;
            }
            else if(s.charAt(i)=='L'){
                sum = sum + 50;
            }
            else if(s.charAt(i)=='C'){
                sum = sum + 100;
            }
            else if(s.charAt(i)=='D'){
                sum = sum + 500;
            }
            else if(s.charAt(i)=='M'){
                sum = sum + 1000;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "III";
        Solution solution = new Solution();
        int res = solution.romanToInt(s);
        System.out.println(res);
    }
}