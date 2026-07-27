class Solution {
    private HashMap<Node,Node> ans = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        if(ans.containsKey(node)){
            return ans.get(node);
        }
        Node clone = new Node(node.val);
        ans.put(node,clone);
        for(Node neighbor:node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}