class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        var result = new HashMap<String>();

        for(int num: nums){
            result.putIfAbsent(num, 0);
            result.compute(num, (k,v) -> v+1);  
        }

        var result1 = result.entrySet()
            .stream()
            .filter((e) -> (e.getValue()>= k))
            .mapToInt(e -> e.getKey()).toList();

        return result1.stream().toArray(int[] ::new);
        
    }
}
