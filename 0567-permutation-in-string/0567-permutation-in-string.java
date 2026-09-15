class Solution {
    private boolean matchfreq(int []arr1,int []arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
    int n=s1.length();
    int m=s2.length();
    if(n>m) return false;
    int []s1a=new int[26];
    int []s2a=new int[26];
    for(int i=0;i<n;i++){
      s1a[s1.charAt(i)-'a']++;
      s2a[s2.charAt(i)-'a']++;
    }
    if(matchfreq(s1a,s2a)) return true;
     for(int i=1;i<=m-n;i++){
      s2a[s2.charAt(i-1)-'a']--;
      s2a[s2.charAt(i+n-1)-'a']++;
      if(matchfreq(s1a,s2a)) return true;
     }
     return false;
    }
}