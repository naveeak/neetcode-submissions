class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int result = nums[0];

        while (i < j) {
            int mid = i + ((j - i) / 2);
            result = Math.min(result, nums[mid]);
            if (nums[mid] >= nums[0]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return result;
    }
}
