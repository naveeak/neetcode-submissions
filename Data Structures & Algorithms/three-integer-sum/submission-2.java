class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int u = i+1;
            int v = nums.length - 1;

            while (u < v) {
                int sum = nums[i] + nums[u] + nums[v];
                if (sum < 0) {
                    u++;
                } else if (sum > 0) {
                    v--;
                } else {
                    result.add(Arrays.asList(nums[u], nums[v], nums[i]));
                    u++;
                    v--;
                }
            }
        }

        return result;
    }
}
