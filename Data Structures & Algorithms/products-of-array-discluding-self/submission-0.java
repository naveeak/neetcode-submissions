class Solution {
    public int[] productExceptSelf(int[] nums) {
        var p = new int[nums.length];
        var s = new int[nums.length];
        var r = new int[nums.length];
        p[0] = 1;

        for(int i = 1 ; i<nums.length;i++){
            p[i] = nums[i-1] * p[i-1];
        }

        s[nums.length-1] = 1;

        for(int i = nums.length - 2 ; i>=0 ;i--){
            s[i] = nums[i+1] * s[i+1];
        }

        for(int i = 0; i<nums.length;i++){
            r[i] = p[i] * s[i];
        }

        // System.out.println(Arrays.toString(p));
        // System.out.println(Arrays.toString(s));

        return r;

        
    }
}  
