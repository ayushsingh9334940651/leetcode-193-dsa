class Solution {
    public void sortColors(int[] nums) {
     int zero=0;
      int one=0;
      int two=0;
      for(int ele:nums){
        if(ele==0) zero++;
        else if(ele==1) one++;
        else two++;
      } 
      int i=0;
      while(zero>0){
        nums[i++]=0;
        zero--;
      }
      while(one>0){
        nums[i++]=1;
        one--;
      }
      while(two>0){
        nums[i++]=2;
        two--;
      }
    }
}