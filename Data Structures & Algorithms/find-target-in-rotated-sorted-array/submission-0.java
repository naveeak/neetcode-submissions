class Solution {
    public int search(int[] nums, int target) {
        int pivot = 4;
        var o = bs(nums, 0, pivot - 1, target);
        var t = bs(nums, pivot, nums.length - 1, target);

        return Math.max(o, t);
    }

    public int bs(int[] nums, int i, int j, int target) {
        while (i < j) {
            int mid = i + ((j - i) / 2);
            if (nums[mid] > target) {
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int pivot(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int mid = i + ((j - i) / 2);

            if (nums[mid] <= nums[i]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }
}
