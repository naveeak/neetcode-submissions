class MedianFinder {
    Queue<Integer> smallHeap;
    Queue<Integer> largeHeap;

    public MedianFinder() {
        // List<Integer> arr = new ArrayList<Integer>();  
        smallHeap = new PriorityQueue<>((a,b) -> b-a); 
        largeHeap = new PriorityQueue<>((a,b) -> a-b);

    }
    
    public void addNum(int num) {
        smallHeap.add(num);
        if(smallHeap.size() - largeHeap.size()  > 1 
        ||  !largeHeap.isEmpty() &&
            smallHeap.peek() > largeHeap.peek() ){
            int removed = smallHeap.poll();
            largeHeap.add(removed);
        }

        if(largeHeap.size() - smallHeap.size() > 1 ){
             smallHeap.add(largeHeap.poll());
        }
    }
    
    public double findMedian() {
        if(smallHeap.size() == largeHeap.size()){
            return (double)(largeHeap.peek() + smallHeap.peek())/2;                       
        } else if (smallHeap.size() > largeHeap.size()) {
            return (double) smallHeap.peek();
        }else {
            return largeHeap.peek();
        }
    }
}
