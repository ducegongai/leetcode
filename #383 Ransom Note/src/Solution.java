import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            if(!map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),1);
            }
            else
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
        }

            System.out.println(map.values());


        for (int i = 0; i < ransomNote.length(); i++) {
            if(map.containsKey(ransomNote.charAt(i))&&map.get(ransomNote.charAt(i))>=1){
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        Solution solution = new Solution();
        boolean res = solution.canConstruct(ransomNote,magazine);
        System.out.println(res);
    }
}

