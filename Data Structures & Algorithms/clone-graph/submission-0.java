/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer,Node> temp = new HashMap<Integer, Node>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;

        var newNode = new Node(node.val);
        temp.putIfAbsent(node.val, newNode);

        for(Node n: node.neighbors){
            if(temp.containsKey(n.val)){
                newNode.neighbors.add(temp.get(n.val));
            }else{
                Node nNew = cloneGraph(n);
                newNode.neighbors.add(nNew);
            }  
        }   

        return newNode;     
        
    }
}