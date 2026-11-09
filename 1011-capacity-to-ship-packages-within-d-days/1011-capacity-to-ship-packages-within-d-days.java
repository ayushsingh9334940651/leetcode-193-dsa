class Solution {
    private boolean verify (int[] weight,int mass,int days){
       int wei=0, day=1;
     for(int ele:weight){
      if(wei+ele>mass){
        day++;
        wei=ele;
      }else wei+=ele;
     }
     if(day<=days) return true;
     return false;
    }
    public int shipWithinDays(int[] weights, int days) {
     int i=0;
     int j=0;
     for (int ele : weights) {
       i=Math.max(i,ele);
       j+=ele;
      }
     int ans=0;
     while(i<=j){
      int mid=i+(j-i)/2;
      if(verify(weights,mid,days)){
       ans=mid;
       j=mid-1;
      }else i=mid+1;
     }
     return ans;
    }
}