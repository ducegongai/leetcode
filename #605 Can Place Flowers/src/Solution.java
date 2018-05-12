class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        int count = n;
        while(i<flowerbed.length){
            if(flowerbed[i] == 0){
                if(i-1<0&&i+1>=flowerbed.length){//左边右边都超了（只有一个元素）
                    count--;
                    return true;

                }
                if((i-1>=0&&flowerbed[i-1] == 0)&&(i+1<flowerbed.length&&flowerbed[i+1]==0)){//左右都没抄，且都为0
                    count--;
                    flowerbed[i]= 1;
                    System.out.println("2flowerbed[" +i+ "]="+1);
                    i=i+1;
                }
                if(i-1<0){//左边超了
                    if(i+1<flowerbed.length&&flowerbed[i+1]==0){//右边没超且为0
                        count--;
                        flowerbed[i]= 1;
                        System.out.println("3flowerbed[" +i+ "]="+1);
                        i=i+1;
                    }
                }
                if(i+1>=flowerbed.length){ //右边超了
                    if(i-1>=0&&flowerbed[i-1] == 0){//左边没超且为0
                        count--;
                        flowerbed[i]= 1;
                        System.out.println("4flowerbed[" +i+ "]="+1);
                        i++;
                    }
                }
            }
            i++;
        }
        if( count <= 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {0,0};
        int n = 2;
        Solution solution = new Solution();
        boolean res = solution.canPlaceFlowers(flowerbed,n);
        System.out.println(res);
    }

}





