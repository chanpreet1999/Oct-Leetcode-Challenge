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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val);
      
        TreeNode prev = null;
        TreeNode cur = root;
      
        while(cur != null)
        {
            prev = cur;
                
            if( cur.val < val )
            {
                cur = cur.right;
            }
            else
            {
                cur = cur.left;    
            }
        }
        if(val < prev.val)
            prev.left = new TreeNode( val );
        else
            prev.right = new TreeNode(val);
        
        return root;
    }
}