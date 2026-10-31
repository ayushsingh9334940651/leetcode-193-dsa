class Solution {
    public static void quicksoort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
       int n= quicksoortidx(arr,start,end);
        quicksoort(arr, start,n-1 );
        quicksoort(arr, n+1, end);
    }
     public static int quicksoortidx(int arr[],int start,int end){
            int target=arr[end];
            int i=start-1;
            for(int j=start;j<end;j++){
                if(arr[j]<=target){
                    i++;
                   int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;  
                }
            }
            i++;
                   int temp = arr[i];
                    arr[i] = arr[end];
                    arr[end] = temp; 
           return i;
        }
    public void sortColors(int[] nums) {
     quicksoort(nums,0,nums.length-1);
    }
}