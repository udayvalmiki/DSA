public class lineararr{
    public static void main(String[] args){
        int[] arr = {};
          int ans = linearSearch(arr,5); 
          System.out.println(ans);
        }
        static int linearSearch(int[] arr,int target){
            if(arr.length == 0){
                return -1;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;
    }
}