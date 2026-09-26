class Solution {
 private void mergesort(int arr[],int low,int high){
     if(low>=high) return ;
    
     int mid=low+(high-low)/2;
     mergesort(arr,low,mid);
     mergesort(arr,mid+1,high);
     merge(arr,low,mid,high);
    }
 private void merge(int arr[],int low,int mid,int high){
    int i=low; int j=mid+1;
    int temp[]=new int[high-low+1];
    int k =0;
  while(i<=mid && j<=high){
     if(arr[i]<=arr[j] ) temp[k++]=arr[i++];
     else temp[k++]=arr[j++];
  }
  while(i<=mid){
    temp[k++]=arr[i++];

  }
  while(j<=high){
    temp[k++]=arr[j++];
  }
  for(int v=0;v<temp.length;v++){
    arr[low+v]=temp[v];
  }
}
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
        mergesort(candidates,0,candidates.length-1);
      ArrayList<List<Integer>>result= new ArrayList<>();
      ArrayList<Integer> help=new ArrayList<>(); 
      solution(candidates,target,0,result,help);
      return result;
    }
}