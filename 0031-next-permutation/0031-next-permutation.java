class Solution {
    public void nextPermutation(int[] nums) {
     
     int pivot=-1;
     for(int i=nums.length-2;i>=0;i--){
       if(nums[i]<nums[i+1]){
        pivot=i;
        break;
       }

     }
     if(pivot==-1){
        int i=0;
        int j=nums.length-1;
        while(i<j){
       int temp=nums[i];
       nums[i]=nums[j];
       nums[j]=temp;
       i++;
       j--;
     }
        return;
     }
     for(int i=nums.length-1;i>=pivot+1;i--){
        if(nums[i]>nums[pivot]){
            int temp=nums[i];
            nums[i]=nums[pivot];
            nums[pivot]=temp;
            break;
        }
     }
     int i=pivot+1;
     int j=nums.length-1;
     while(i<j){
       int temp=nums[i];
       nums[i]=nums[j];
       nums[j]=temp;
       i++;
       j--;
     }
    }
}