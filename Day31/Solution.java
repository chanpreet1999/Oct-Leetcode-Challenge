/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    TreeNode prev = null, A = null, B = null;
    
    public void recoverTree(TreeNode root) {
        if(root == null)
            return;
        
        helper(root);
        int temp =  A.val;
        A.val = B.val;
        B.val = temp;
        
    }
    
    void helper(TreeNode node)
    {
        if(node == null)
            return;
        
        helper(node.left);
        if(prev != null && node.val < prev.val)
        {
            if(A == null)
                A = prev;
            B = node;
        }
        prev = node;
        
        helper(node.right);
    }
}