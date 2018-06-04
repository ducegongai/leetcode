import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int temp = 0;
        String res = " ";
        char[] text = paragraph.toCharArray();//大写ASCII小于等于90 相差32
        for (int i = 0; i < text.length; i++) {
            if(text[i]<=90&&(int)text[i]>=65){//所有大写字母转为小写
                temp = (int)text[i]+32;
                text[i] = (char)temp;
            }
        }
        paragraph = new String(text);
        paragraph = paragraph.replaceAll("[\\pP]","");
        String[] words = new String[100];
        words = paragraph.split(" ");//words 为单词字符串数组
        HashMap<String,Integer> list = new HashMap<String,Integer>();//list 为哈希表
        for (int i = 0; i < words.length; i++) {
            if(list.containsKey(words[i])){
                 list.put(words[i],list.get(words[i])+1);
            }
            else{
                list.put(words[i],1);
            }
        }
        for (int i = 0; i < banned.length; i++) {
            list.remove(banned[i]);
        }
        List<Integer> valuesList = new ArrayList<Integer>(list.values());
        Integer[] valuesArray = valuesList.toArray(new Integer[valuesList.size()]);//valuesArray为value数组
        Arrays.sort(valuesArray);
        for (int i = 0; i < words.length; i++) {
            if(list.get(words[i])==valuesArray[valuesArray.length-1]){
                res = words[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        Solution solution = new Solution();
        String res = solution.mostCommonWord(paragraph,banned);
        System.out.println(res);
    }

}