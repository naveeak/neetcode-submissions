class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var result = new ArrayList<List<String>>();
        var visited = new int[strs.length];

        for (int i = 0; i < strs.length ; i++) {
            if(visited[i] == 1) continue;
            var temp = new ArrayList<String>();
            // temp.add(strs[i]);
            for (int j = i; j < strs.length; j++) {
                if(isAnagram(strs[i], strs[j])){
                    visited[j] = 1;
                    temp.add(strs[j]);
                }
            }
            result.add(temp);
        }
        return result;
    }

    public static boolean isAnagram(String s, String t) {
        var sH = new HashMap<Character, Integer>();
        var tH = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            if (sH.containsKey(c)) {
                sH.computeIfPresent(c, (k, v) -> v + 1);
            } else {
                sH.put(c, 0);
            }
        }

        for (char c : t.toCharArray()) {
            if (tH.containsKey(c)) {
                tH.computeIfPresent(c, (k, v) -> v + 1);
            } else {
                tH.put(c, 0);
            }
        }

        return sH.equals(tH);
    }
}
