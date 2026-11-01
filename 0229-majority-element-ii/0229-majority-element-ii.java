class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans= new ArrayList<>();
        int n = nums.length;
        int max=1;
       for(int i=1;i<nums.length;i++){
          if(nums[i]==nums[i-1]) max++;
          else{
            if(n/3<max){
            ans.add(nums[i-1]);
           }
           max=1;   
          }
       }
       if(n/3<max) ans.add(nums[n-1]);
       return ans;
    }
}