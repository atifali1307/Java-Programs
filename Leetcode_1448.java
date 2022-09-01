// Leetcode 1448
// Count Good Notes in Binary Tree

class Solution {
    public int goodNodes(TreeNode root) {
        if(root==null)
            return 0;
        int val=root.val;
        return 1+recGoodNodes(root.left,val)+recGoodNodes(root.right,val);
    }
    public int recGoodNodes(TreeNode node,int max){
        if(node==null)
            return 0;
        int result=0;
        int val=node.val;
        if(val>=max){
            max=val;
            result=1;
        }
        result+=recGoodNodes(node.left,max);
        result+=recGoodNodes(node.right,max);
        return result;
    }
}