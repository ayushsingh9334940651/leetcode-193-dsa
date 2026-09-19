
class Solution {
    public boolean isValidBST(TreeNode root) {
      TreeNode curr=root;
      long prev=Long.MIN_VALUE;
      while(curr!=null){
        if(curr.left!=null ){
            TreeNode pred=curr.left;
            while(pred.right!=null && pred.right!=curr ) pred=pred.right;
             if(pred.right==null){
                pred.right=curr;
                curr=curr.left;
            }
            else{
                pred.right=null;
                if(prev>=curr.val)  return false;
                 prev=curr.val;
                curr=curr.right;
            }
        }else{
            if(prev>=curr.val)  return false;
             prev=curr.val;
            curr=curr.right;
        }
      }
    return true;
    }
}