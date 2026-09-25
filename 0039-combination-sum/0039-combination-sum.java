class Solution {
    private void solution(int[] candidates, int target,int indx,ArrayList<List<Integer>>result,ArrayList<Integer>help){
     if(target==0){
      result.add(new ArrayList<>(help));
      return;
     }
     if(indx==candidates.length || target<0) return;
     help.add(candidates[indx]);
     solution(candidates,target-candidates[indx],indx,result,help);
     help.remove(help.size()-1);
     solution(candidates,target,indx+1,result,help);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     ArrayList<List<Integer>>result= new ArrayList<>();
     ArrayList<Integer> help=new ArrayList<>();
     solution(candidates,target,0,result,help);
     return result;
    }
}