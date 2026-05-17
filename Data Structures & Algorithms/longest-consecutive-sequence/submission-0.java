class Solution {
    Set<Integer> temp = new HashSet<Integer>();
    public int longestConsecutive(int[] nums) {
        var result = 0;
        for(int num : nums){
            temp.add(num);
        }

        for(int num: nums){
            result = Math.max(howMuchNext(num)+1, result);
        }

        return result;
    }

    public int howMuchNext(int val){
        if(temp.contains(val+1)){
            return howMuchNext(val+1)+1;
        }else {
            return 0;
        }
    }
}
