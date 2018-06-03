
class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        boolean flg1 = false,flg2 = true;
        for (int j = 2; j <= N; j++) {
            String word = Integer.toString(j);
            flg1 = false;
            flg2 = true;
            for (int i = 0; i < word.length(); i++) {
                if((word.charAt(i) == '2')||(word.charAt(i) == '5')||(word.charAt(i) == '6')||(word.charAt(i) == '9')){
                    flg1 = true;
                }
                if(word.charAt(i)=='3'||word.charAt(i)=='4'||word.charAt(i)=='7'){
                    flg2 = false;
                    break;
                }
            }
            if(flg1 == true&&flg2 == true){
                System.out.println(word);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 857;
        Solution solution = new Solution();
        int res = solution.rotatedDigits(N);
        System.out.println(res);

    }
}