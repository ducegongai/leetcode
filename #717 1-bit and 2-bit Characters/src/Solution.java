class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        for (int i = 0; i < n; i++) {
            if(i==n-2)
                if(bits[i]==1)
                    return false;
                else
                    return true;
            if(bits[i]==1)
                i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bits = {1,1,1,0};
        Solution solution = new Solution();
        boolean ans = solution.isOneBitCharacter(bits);
        System.out.println(ans);
    }
}