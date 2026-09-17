class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           int indx = Math.abs(nums[i]);
           if(nums[indx-1] > 0) nums[indx-1]=-nums[indx-1];
        }
        for(int i=0;i<nums.length;i++){
         if(nums[i]>0) ans.add(i+1);
        }
        return ans;
    }
}