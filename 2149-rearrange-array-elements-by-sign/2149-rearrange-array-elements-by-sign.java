class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int ele:nums){
            if(ele>0) pos.add(ele);
            else neg.add(ele);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i%2!=0) nums[i]=neg.remove(neg.size()-1);
            else nums[i]=pos.remove(pos.size()-1);
        }
        return nums;
    }
}