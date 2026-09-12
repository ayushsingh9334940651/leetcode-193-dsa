class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
         if(!set.contains(nums[i])){
            set.add(nums[i]);
         }else ans[0]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
         if(!set.contains(i+1)){
            ans[1]=i+1;
         }
        }
        return ans;
    }
}