class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length<3) return -1;
        int max=Integer.MAX_VALUE;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int ele:nums){
        if(map.containsKey(ele)){
            int fre=map.get(ele);
            map.put(ele,fre+1);
            if(map.get(ele)==3){
             ArrayList<Integer> arr=new ArrayList<>();
             for(int i=0;i<nums.length;i++){
                if(nums[i]==ele) arr.add(i);
             }
             for(int j=0;j<arr.size()-2;j++){
                int sum=Math.abs(arr.get(j)-arr.get(j+1))+Math.abs(arr.get(j+1)-arr.get(j+2))+Math.abs(arr.get(j+2)-arr.get(j));
                max=Math.min(max,sum);
             }
            }
        }else map.put(ele,1);
     }
     if(max==Integer.MAX_VALUE) return -1;
     return max;
    }
}