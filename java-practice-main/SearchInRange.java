public class SearchInRange{
    public static void main(String[] args){
        int[] arr = {-2,0,5,2,-3,-5,8,-1};
          int ans = linearSearch(arr,5,1,6); 
          System.out.println(ans);
        }
        static int linearSearch(int[] arr,int target, int start, int end){
            if(arr.length == 0){
                return -1;
            }
            for(int i=start;i<end;i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;
    }
}