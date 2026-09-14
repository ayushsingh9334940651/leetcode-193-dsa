class Solution {
    public String reverseWords(String s){
     String [] word=s.trim().split("\\s+");
     StringBuilder result=new StringBuilder();
     for(int i=word.length-1;i>=0;i--){
        result.append(word[i]);
        if(i!=0) result.append(' ');
     }
     return result.toString();
    }
}