class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length<3) return -1;
        int ans=Integer.MAX_VALUE;
     HashMap<Integer,List<Integer>> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int ele=nums[i];
        if(map.containsKey(ele)){
            map.get(ele).add(i); 
             if(map.get(ele).size()>=3){
                int last=map.get(ele).get(map.get(ele).size()-1);
                int first=map.get(ele).get(map.get(ele).size()-3);
                ans=Math.min(ans,2*(last-first));
             }
             
        }  
       else{
         map.put(ele,new ArrayList<>());
         map.get(ele).add(i);

       } 
    }
     if(ans==Integer.MAX_VALUE) return -1;
     return ans;
    }
}