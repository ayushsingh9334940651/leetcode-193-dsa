
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp=root;
      while(true){
        if(val<temp.val) temp=temp.left;
        else if (val>temp.val) temp=temp.right;
         else break;
        if(temp.left==null && temp.right==null ||  temp.left==null && val<temp.val || temp.right==null && val>temp.val) break;
      }
      if(val!=temp.val) return null;
      return temp;
    }
}