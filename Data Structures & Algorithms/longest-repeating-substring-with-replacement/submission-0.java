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
            int replace = 0;
            // "AAABABB"
            while (j < s.length()) {
                System.out.println(i + "==>" + j + "===>" + replace + "==>" + result);
                if (s.charAt(j) == c) {
                    result = Math.max(result, j - i + 1);
                    j++;
                    continue;
                } else if (replace == k) {
                    i++;
                    // j++;
                    replace--;
                } else {
                    result = Math.max(result, j - i + 1);
                    j++;
                    replace++;
                }

                
            }
        }

        return result;
    }
}
