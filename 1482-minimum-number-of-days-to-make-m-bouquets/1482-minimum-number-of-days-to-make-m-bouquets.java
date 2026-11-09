class Solution {
    private boolean verify(int []bloomDay,int day,int m,int k){
        int count=0; int b=0;
     for(int ele:bloomDay){
        if(ele<=day) count++;
        else{
         b+=count/k;
         count=0;
        }
     }
     b+=count/k;
     if(b>=m) return true;
     return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
      if( (long) m*k>bloomDay.length) return -1;
      int ans=0;
      int j=1; int i=Integer.MAX_VALUE;
      for( int ele:bloomDay){
        i=Math.min(i,ele);
        j=Math.max(j,ele);
      }
      while(i<=j){
       int mid=i+(j-i)/2;
       if(verify(bloomDay,mid,m,k)){
        ans=mid;
        j=mid-1;
       }else i=mid+1;
      } 
      return ans;
    }
}