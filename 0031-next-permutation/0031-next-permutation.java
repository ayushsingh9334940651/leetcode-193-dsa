class Solution {
    public void nextPermutation(int[] nums) {
     int pre=-1;
     int n=nums.length-1;
     for(int i=n;i>0;i--){
        if(nums[i]>nums[i-1]){
            pre=i-1;
            break;
        }
     }
     if(pre==-1){
        int i=0;int j=n;
        while(i<j){
            int temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
     }else{
        for(int i=n;i>=pre;i--){
          if(nums[pre]<nums[i]){
            int temp=nums[i];
           nums[i]=nums[pre];
            nums[pre]=temp;
            break;
          }
        }
        
        int i=pre+1;
        int j=n;
        while(i<j){
            
             int help=nums[i];
            nums[i++]=nums[j];
            nums[j--]=help;
        }
     }

    }
}