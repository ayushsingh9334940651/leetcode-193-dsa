class Solution {
    public int minimumDeletions(int[] nums) {
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     int maxindx=0;
     int minindx=0;
     for(int i=0;i<nums.length;i++){
        if(max<nums[i]){
         max=nums[i];
         maxindx=i;
        }
        if(min>nums[i]){
            min=nums[i];
            minindx=i;
        }
     }
      int front=Math.max(maxindx,minindx) + 1;
      int back=nums.length-Math.min(maxindx,minindx);
      int both=Math.min(maxindx, minindx)+1+nums.length-Math.max(maxindx, minindx);

       return Math.min(front, Math.min(back, both));
    }
}