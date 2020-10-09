/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    int idx = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
            return "";
        
        StringBuilder sb = new StringBuilder();
        ser(root, sb);
        System.out.println(sb);
        
        return sb.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "")
            return null;
        
        String s[] = data.split(" ");
        
        return construct( s, 0, s.length-1 );    
    }
    
    
    TreeNode construct( String[] data, int si, int ei )
    {
        if(si > ei)
        {
            return null;
        }
            
        int val = Integer.parseInt( data[si] );
        TreeNode root = new TreeNode(val);
        
        int i = 0; 
        for(i = si; i <= ei; i++ )
        {
            int temp = Integer.parseInt( data[i] );
            if( temp > val )
                break;
        }
        
        root.left = construct(data, si+1, i-1);
        root.right = construct(data, i, ei);
        
        return root;
    }
    
    void ser(TreeNode root, StringBuilder sb)
    {
        if(root == null)
        {    
            return;
        }
        
        sb.append( root.val ).append( " ");
        ser(root.left, sb);
        ser(root.right, sb);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;