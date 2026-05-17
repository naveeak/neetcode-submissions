class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var result = new HashMap<String,List<String>>();
        var visited = new int[strs.length];

        for (int i = 0; i < strs.length ; i++) {
            int[] count = new int[26];
            for(char c: strs[i].toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            result.putIfAbsent(key,new ArrayList<>());
            result.get(key).add(strs[i]);

        }
        return new ArrayList<>(result.values());
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
