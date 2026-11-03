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


    public boolean isSameTree(TreeNode p, TreeNode q){
        // base case, if both nodes are null return true
        if (q == null && p == null){
            return true;
        }
        // if both p and q aren't null and their values are the same, return recursive call on left and right subtrees
        if (p == null || q == null){
            return false;
        }
        // if only one of p and one of q is null or p.val != q.val return false
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if (isSameTree(root, subRoot)){
            return true;
        }
        else {
            return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
        }

    }
}
