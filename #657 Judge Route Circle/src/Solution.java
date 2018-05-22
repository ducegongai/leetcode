class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        int len = moves.length();
        for (int i = 0; i < len; i++) {
            if(moves.charAt(i)=='U'){
                x++;
            }
            if(moves.charAt(i)=='D'){
                x--;
            }
            if(moves.charAt(i)=='L'){
                y--;
            }
            if(moves.charAt(i)=='R'){
                y++;
            }
        }
        if(x==0&&y==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String moves = "UD";
        Solution solution = new Solution();
        boolean res = solution.judgeCircle(moves);
        System.out.println(res);

    }
}