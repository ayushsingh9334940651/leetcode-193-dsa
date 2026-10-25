class Solution {
    private void solution(int nums[],ArrayList<List<Integer>> ans,ArrayList<Integer>help,int i){
      if(i==nums.length){
        ans.add(new ArrayList<>(help));
        return;
      }
       help.add(nums[i]);
      solution(nums,ans,help,i+1);
      help.remove(help.size()-1);
      solution(nums,ans,help,i+1);
      return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        solution(nums,ans,new ArrayList<>(),0);
        return ans;
    }
}