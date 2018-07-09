import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set <String>set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String tmp = "";
            String cur = words[i];
            for (int j = 0; j < cur.length(); j++) {
                tmp = tmp + morse[(cur.charAt(j)-'a')];
            }
            if(!set.contains(tmp)){
                set.add(tmp);
            }
        }
        return set.size();
    }
}