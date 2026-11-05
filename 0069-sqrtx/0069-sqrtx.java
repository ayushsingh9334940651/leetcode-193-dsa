class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int i=0;int j=x;
        int ans=0;
        while(i<=j){
          int mid=i+(j-i)/2;
          long sqr=(long) mid*mid;
          if(sqr<=x){
            ans=mid;
            i=mid+1;
          }else j=mid-1;
        }
        return ans;
    }
}