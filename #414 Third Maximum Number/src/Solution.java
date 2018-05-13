import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Solution {
    public int thirdMax(int[] nums) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }

        Comparator c = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                if((int)o1>(int)o2)
                    return 1;
                    //注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。
                    //      else return 0; //无效
                else return -1;
            }
        };
        list.sort(c);

        //Collections.sort(list);
        if(list.size()>=3)
            return (int)list.get(list.size()-3);
        else
            return (int)list.get(list.size()-1);
    }
}