class Solution {
    public int[] twoSum(int[] nums, int target) {
     int arr[]=new int[2];
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
     int remain=target-nums[i];
     if(map.containsKey(remain)){
        arr[0]=map.get(remain);arr[1]=i;
        return arr;
     }else{
        map.put(nums[i],i);
     }
     }
     return  arr;
    }
}