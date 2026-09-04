class Solution {
    public double myPow(double x, int n) {
     if(n==0) return 1;
      double halfpow=myPow(x,n/2);
      double halfpowsq=halfpow*halfpow;
       if(n<0) x=1/x;
       if(n%2!=0){
        return x*halfpowsq;
       }
      return halfpowsq;
    }
}