
class Solution {
    public boolean isValidBST(TreeNode root) {
      return validBst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean validBst(TreeNode root,long min,long max){
        if(root==null) return true;
        if(root.val>=max || root.val<=min) return false;
        return validBst(root.left,min,root.val) && validBst(root.right,root.val,max);
    }
}