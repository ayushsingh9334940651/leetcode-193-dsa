class Solution {
    public int compress(char[] chars) {
     if(chars.length==1) return 1;
     int k=0;
     for(int i=0;i<chars.length;i++){
        int count=1;
        while(i<chars.length-1 && chars[i]==chars[i+1]) {
            count++;
            i++;
        }
         chars[k++]=chars[i];
         if(count>1){
            String s=String.valueOf(count);
            for(int j=0;j<s.length();j++){
             chars[k++]=s.charAt(j);
            }
         }
     }
       
     return k;
    }
}