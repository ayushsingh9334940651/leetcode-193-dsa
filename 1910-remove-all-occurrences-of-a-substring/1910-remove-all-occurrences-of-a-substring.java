class Solution {
    public String removeOccurrences(String s, String part) {

    while(s.length()>=part.length() && s.indexOf(part)<s.length() && s.indexOf(part)!=-1){
      s=s.substring(0,s.indexOf(part))+s.substring(s.indexOf(part)+part.length());
    }
    return s;
    }
}