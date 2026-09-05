class Solution {
    public int minimumDistance(int[] nums) {
     if(nums.length<3) return -1;
     int [] fre=new int[101];
     int ans=Integer.MAX_VALUE;
     for(int ele:nums){
        fre[ele]++;
        if(fre[ele]==3){
         ArrayList<Integer> arr=new ArrayList<>();
          for(int i=0;i<nums.length;i++){
            if(nums[i]==ele) arr.add(i); 
          }
         for(int i=0;i<arr.size()-2;i++){
         int help = Math.abs(arr.get(i)-arr.get(i+1))
             + Math.abs(arr.get(i+1)-arr.get(i+2))+Math.abs(arr.get(i+2)-arr.get(i));

            ans = Math.min(ans, help);
          }
        }
     }
     if(ans==Integer.MAX_VALUE) return -1;
     return ans;
    }
}