public class BinarySearch{
    public static void main(String[] args){
        // int[] arr = {1,2,3,4,5,-3,-2,-1,0,};
        int[] arr ={0,1,3,3,3,5,6};
        System.out.println(BinarySearch(arr,3));
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
            return -1;

    }
}