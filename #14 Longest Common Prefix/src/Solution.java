class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        String res = strs[0];
        String tmp ="";
        for (int i = 0; i < res.length(); i++) {
            tmp = tmp + res.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(tmp.length()>strs[j].length())
                    if(tmp.length()>0)
                        return tmp.substring(0,tmp.length()-1);
                    else if(tmp.length()==0)
                        return "";
                if(!tmp.equals(strs[j].substring(0,i+1))) {
                    if(tmp.length()>0)
                        return tmp.substring(0,tmp.length()-1);
                    else if(tmp.length()==0)
                        return "";

                }
            }
        }
        return tmp;
    }
}