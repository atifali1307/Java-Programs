// Leetcode 429
// N-ary Tree Level Order Traversal

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                Node node=q.poll();
                if(node.children!=null){
                    for(Node c:node.children){
                        q.offer(c);
                    }
                }
                level.add(node.val);
            }
            result.add(level);
        }
        return result;
    }
}