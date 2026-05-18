class Solution {
    public int characterReplacement(String s, int k) {
        var temp = new HashSet<Character>();

        var result = 0;

        for (char c : s.toCharArray()) {
            temp.add(c);
        }

        for (char c : temp) {
            int i = 0;
            int j = 0;
            int count = 0;
            // "AAABABB"
            while (j < s.length()) {
                // System.out.println(i + "==>" + j + "===>" + count + "==>" + result);
                if (s.charAt(j) == c) {
                    count++;
                }

                while ((j-i + 1) - count > k) {
                    if (s.charAt(i) == c) {
                        count--;
                    }
                    i++;
                }

                result = Math.max(result, j - i + 1);
                j++;
            }
        }

        return result;
    }
}
