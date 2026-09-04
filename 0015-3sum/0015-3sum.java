class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
      ArrayList<List<Integer>> ans=new ArrayList<>();
      if( nums.length<3) return ans;
      for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        int j=i+1; int k=nums.length-1;
        while(j<k){
        if(nums[i]+nums[j]+nums[k]==0){
         ArrayList<Integer> help=new ArrayList<>();
         help.add(nums[i]);
         help.add(nums[j++]);
         help.add(nums[k--]);
         ans.add(help);
         while(j<k && nums[j]==nums[j-1] ) j++;
         while(j<k && nums[k]==nums[k+1] ) k--;
        
        }
        else if (nums[i]+nums[j]+nums[k]>0) k--;
        else j++;
        }
      }
      return ans;
    }
}