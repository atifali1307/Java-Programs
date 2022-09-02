// Leetcode 637
// Average of Levels in Binary Tree

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>(List.of(root));
        List<Double> result=new ArrayList<>();
        while(q.size()>0){
            double qlen=q.size(), row=0;
            for(int i=0;i<qlen;i++){
                TreeNode curr=q.poll();
                row+=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            result.add(row/qlen);    
        }
        return result;
    }
}