class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0;
        int n=nums1.length;
        int m=nums2.length;
        int help[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
          if(nums1[i]<=nums2[j]){
            help[k++]=nums1[i++];
          }else{
            help[k++]=nums2[j++];
          }
        }
        while(i<n){
            help[k++]=nums1[i++];
        }
        while(j<m){
            help[k++]=nums2[j++];
        }
        for(int a=0;a<help.length;a++){
            System.out.print(help[a]+" ");
        }
        if(help.length%2!=0){
            ans=help[help.length/2];
        }
        else{
            ans=(double)(help[help.length/2]+help[help.length/2-1])/2;
        }
        return ans;
    }
}