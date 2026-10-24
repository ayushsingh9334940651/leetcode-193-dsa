
class pair{
    TreeNode root;
    int level;
    pair(TreeNode root,int level){
        this.root=root;
        this.level=level;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
     ArrayList<List<Integer>> ans=new ArrayList<>();
     if(root==null) return ans;
     ArrayList<Integer> help=new ArrayList<>();
     Queue<pair> q=new LinkedList<>();
      q.add(new pair(root,0));
      int curr=0;
      while(!q.isEmpty()){
        pair front=q.remove();
        if(front.level!=curr){
         ans.add(help);
         help=new ArrayList<>();
         curr++;
        }
        help.add(front.root.val);
        if(front.root.left!=null)  q.add(new pair(front.root.left,front.level+1));
        if(front.root.right!=null) q.add(new pair(front.root.right,front.level+1));
     }
     ans.add(help); 
     return ans;
    }
}