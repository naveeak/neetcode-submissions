class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        var result = 0;

        while(i<j){
            int maxHeight = Math.min(heights[i],heights[j]);
            result = Math.max(maxHeight * (j-i), result);

            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return result;
        
    }
}
