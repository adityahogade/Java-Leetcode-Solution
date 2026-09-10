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
    public boolean sufficTree(TreeNode root,int limit,long prev){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            return (prev+root.val)>=limit;
        }
        boolean p1=sufficTree(root.left,limit,prev+root.val);
        boolean p2=sufficTree(root.right,limit,prev+root.val);
        if(!p1)root.left =null;
        if(!p2) root.right=null;
        return p1||p2;
    }
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        boolean val=sufficTree(root,limit,0);
        if(!val)root=null;
        return root;
    }
}