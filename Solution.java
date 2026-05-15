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
    private void traverse(TreeNode p, TreeNode q, boolean[] b){
        if(p == null){
            if(q != null){
                b[0] = false;
            }

            return;
        }

        if(q == null){
            b[0] = false;
            return;
        }

        if(p.val != q.val){
            b[0] = false;
        }

        traverse(p.left, q.left, b);
        traverse(p.right, q.right, b);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] b = {true};
        traverse(p, q, b);
        return(b[0]);
    }
}
