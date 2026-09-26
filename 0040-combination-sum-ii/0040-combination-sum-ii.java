class Solution {
    private void solution(int []candidates,int target,int indx, ArrayList<List<Integer>>result, ArrayList<Integer> help){
      if(target==0){
        result.add(new ArrayList<>(help));
        return;
      }
      if(target<0 || indx==candidates.length){
        return;
      }
     help.add(candidates[indx]);
     solution(candidates,target-candidates[indx],indx+1,result,help);
      help.remove(help.size()-1);
      while(indx+1 < candidates.length && candidates[indx] == candidates[indx+1])  indx++;
      solution(candidates,target,indx+1,result,help);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
      ArrayList<List<Integer>>result= new ArrayList<>();
      ArrayList<Integer> help=new ArrayList<>(); 
      solution(candidates,target,0,result,help);
      return result;
    }
}