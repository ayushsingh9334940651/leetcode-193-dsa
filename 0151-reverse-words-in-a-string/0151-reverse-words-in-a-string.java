class Solution {
     private String reverstring(String s,int low,int high){
        char arr[]=s.toCharArray();
        int i=low;
        int j=high-1;
        while(i<j){
         char ch=arr[i];
         arr[i]=arr[j];
         arr[j]=ch;
         i++;
         j--; 
        }
     return new String(arr);
    }
    public String reverseWords(String s) {
         s = s.trim();  
     String ss=reverstring(s,0,s.length());
     for(int i=0;i<ss.length();i++){
      if(ss.charAt(i)==' ') continue;
        int j=i;
     while(j<ss.length() && ss.charAt(j)!=' ')j++;
      ss= reverstring(ss,i,j);
       i=j;
     }
     return ss.replaceAll("\\s+", " ");
    }
}