class Solution {
    public int findDuplicate(int[] nums) {
       boolean check[]=new boolean[nums.length];
       int ans=0;
       for(int i=0;i<nums.length;i++){
        if(check[nums[i]]==true){
            ans=nums[i];
            break;
        }
        else{
            check[nums[i]]=true;
        }
       }
       return ans;
    }
}