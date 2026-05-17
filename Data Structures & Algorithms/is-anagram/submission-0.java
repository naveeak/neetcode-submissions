class Solution {
    public boolean isAnagram(String s, String t) {
        var sH = new HashMap<Character, Integer>();
        var tH = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()){
            if(sH.containsKey(c)){
                sH.computeIfPresent(c, (k,v)-> v+1);
            }else {
                sH.put(c,0);
            }
        }

        for(char c : t.toCharArray()){
            if(tH.containsKey(c)){
                tH.computeIfPresent(c, (k,v)-> v+1);
            }else {
                tH.put(c,0);
            }
        }

        return sH.equals(tH);

    }
}
