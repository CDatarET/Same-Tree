public class Solution {
    private void traverse(TreeNode p, TreeNode q, bool[] b){
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
    public bool IsSameTree(TreeNode p, TreeNode q) {
        bool[] b = {true};
        traverse(p, q, b);
        return b[0];
    }
}
