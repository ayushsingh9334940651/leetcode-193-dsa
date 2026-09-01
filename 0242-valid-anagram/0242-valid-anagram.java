class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> mapS=new HashMap<>();
    HashMap<Character,Integer> mapT=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char ele=s.charAt(i);
        if(mapS.containsKey(ele)){
            int freS=mapS.get(ele);
            mapS.put(ele,freS+1);
        }else{
            mapS.put(ele,1);
        }
    }
     for(int i=0;i<t.length();i++){
        char ele=t.charAt(i);
        if(!mapS.containsKey(ele)) return false;
        if(mapT.containsKey(ele)){
            int freT=mapT.get(ele);
            mapT.put(ele,freT+1);
        }else{
            mapT.put(ele,1);
        }
    }
     for(int i=0;i<s.length();i++){
            char a = s.charAt(i);

            int freS = mapS.get(a);

            if(!mapT.containsKey(a)) return false;

            int freT = mapT.get(a);

            if(freS != freT) return false;
        }

        return true;
}
}