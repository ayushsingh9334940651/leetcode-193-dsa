class Solution {
 private boolean validmid(int n,int []quantities,int max){
    for(int ele: quantities){

        n-=(ele+max-1)/max;
        if(n<0) return false;
    }
    return true;
 }
 public int minimizedMaximum(int n, int[] quantities) {
  int right = 0;
  for (int q : quantities) {
    right = Math.max(right, q);
  }
  int left=1;
  int ans=0;
  while(left<=right){
    int mid=left+(right-left)/2;
    if(validmid(n,quantities,mid)){
        ans=mid;
        right=mid-1;
    }else{
        left=mid+1;
    }
  }
  return ans;
  }
}