class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        System.out.println(pivot);
        var o = bs(nums, 0, pivot-1, target);
        if (o != -1) {
            return o;
        }
        return bs(nums, pivot, nums.length - 1, target);
    }

    public int bs(int[] nums, int i, int j, int target) {
        while (i <= j) {
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

            if (nums[mid] <= nums[j]) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }
}
