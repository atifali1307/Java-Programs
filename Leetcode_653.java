// Leetcode 653
// Two Sum IV - Input is a BST

class Solution {
    Set<Integer> hashset = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
         if (root == null) {
            return false;
        }
        if (hashset.contains(k - root.val)) {
            return true;
        }
        hashset.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}