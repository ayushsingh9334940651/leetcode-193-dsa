class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
     if(strs.length==1) return new ArrayList<>(Arrays.asList(Arrays.asList(strs[0])));
     HashMap<String,List<String>> map=new HashMap<>();
     for(String str:strs){
      char [] ch=str.toCharArray();
      Arrays.sort(ch);
      String sortedstr=new String(ch);
      if(!map.containsKey(sortedstr)){
        map.put(sortedstr,new ArrayList<>());
      }
      map.get(sortedstr).add(str);
     }
     return new ArrayList<>(map.values());
    }
}