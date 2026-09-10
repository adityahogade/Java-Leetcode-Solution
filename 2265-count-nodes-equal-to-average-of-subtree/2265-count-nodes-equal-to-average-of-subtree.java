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
    int c=0;
    public int[] avgCount(TreeNode root){
        if(root==null){
            int val[]= {0,0};
            return val;
        }
    
            int val1[]=avgCount(root.left);
            int val2[]=avgCount(root.right);
            int  sum=val1[0]+val2[0]+root.val;
            int  cou=val1[1]+val2[1]+1;
            int avg= sum/cou;
            if(avg==root.val)c++;
            int[] ans={sum,cou};
            return ans;
        
    }
    public int averageOfSubtree(TreeNode root) {
        int[] sum =avgCount(root);
        return c;
    }
}