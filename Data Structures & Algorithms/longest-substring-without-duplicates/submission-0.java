class Solution {
    public int lengthOfLongestSubstring(String s) {
        var temp = new HashSet<Character>();

        int i = 0;
        int j = 0;
        int result = 0;

        while (j < s.length()) {
            if (!temp.contains(s.charAt(j))) {
                temp.add(s.charAt(j));
                result = Math.max(result, j - i + 1);
                j++;
            } else {
                // while (i < j && temp.contains(s.charAt(j))) {
                //     temp.remove(s.charAt(i));
                //     i++;
                // }

                temp.remove(s.charAt(i));
                i++;
            }
        }

        return result;
    }
}
