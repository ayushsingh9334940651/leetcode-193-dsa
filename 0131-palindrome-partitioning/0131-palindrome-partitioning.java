class Solution {
    private boolean ispalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    private void solution(String s,int indx,ArrayList<List<String>>result,ArrayList<String>help){
     
     if(indx>=s.length()){
        result.add(new ArrayList<>(help));
       return;
     } 
     StringBuilder str=new StringBuilder();
     for(int i=indx;i<s.length();i++){
      str.append(s.charAt(i));
      if(ispalindrom(str.toString())){
        help.add(str.toString());
        solution(s,i+1,result,help);
         help.remove(help.size() - 1);        
      }
     }
    }
    public List<List<String>> partition(String s) {
         ArrayList<List<String>>result= new ArrayList<>();
     ArrayList<String> help=new ArrayList<>();
     solution(s,0,result,help);
     return result;
    }
}