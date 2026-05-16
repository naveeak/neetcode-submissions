class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long result = (long) (n*(n+1))/2;

        for(int num: nums){
            result -= num;
        }

        return (int)result;

        
    }
}
