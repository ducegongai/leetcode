class Solution {
    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        String tmp = A;

        for (int i = 0; i < B.length(); i++) {
            if(!A.contains(B.charAt(i)+""))
                return -1;
        }
       do{
           if(tmp.contains(B))
               return count;
           tmp = tmp + A;
           count++;
           System.out.println("tmp :"+tmp);
           System.out.println("B :"+B);
        }while(tmp.length()<2*B.length());
        if(!tmp.contains(B))
            return -1;
        else
            return count;
    }
}