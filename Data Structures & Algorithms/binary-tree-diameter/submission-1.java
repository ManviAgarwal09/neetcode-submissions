/**
 * Definition for a binary tree node.
 
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
     int max=Integer.MIN_VALUE;
    int longestpart(TreeNode root){
     
        if(root==null){
            return 0;
        }
        int h1=longestpart(root.left);
        int h2=longestpart(root.right);
         max=Math.max(h1+h2,max);
        return 1+Math.max(h1,h2);
    }
     public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
   longestpart(root);

return max;
        
    }
    }
    
