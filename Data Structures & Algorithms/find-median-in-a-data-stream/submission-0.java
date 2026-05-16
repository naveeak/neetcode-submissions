class MedianFinder {
    List<Integer> arr = new ArrayList<Integer>(); 

    public MedianFinder() {
        // List<Integer> arr = new ArrayList<Integer>();        
    }
    
    public void addNum(int num) {
        arr.add(num);
        Collections.sort(arr);
    }
    
    public double findMedian() {
        int length = arr.size();
        int mid = length/2;
        if(length % 2 == 0){
            return (double)(arr.get(mid) + arr.get(mid-1))/2;                       
        } else {
            return arr.get(mid);
        }
    }
}
