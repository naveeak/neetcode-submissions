class Solution {
    HashSet<Integer> visited = new HashSet<Integer>();
    HashMap<Integer, List<Integer>> tree = new HashMap<Integer, List<Integer>>();
    public boolean validTree(int n, int[][] edges) {
        for (int[] edge : edges) {
            tree.putIfAbsent(edge[0], new ArrayList<Integer>());
            var temp = tree.get(edge[0]);
            temp.add(edge[1]);
            tree.put(edge[0], temp);
        }
        // System.out.println(tree);
        var res = dfs(0);


        // System.out.println(visited);
        return res && (visited.size() == n);

    }

    public boolean dfs(int index){
        var edges = tree.get(index);
        visited.add(index);
        if(edges == null) return true;
        // System.out.println(edges);

        for(int edge: edges){
            if(visited.contains(edge)) return false;
            dfs(edge);
        }

        return true;
    }
}
