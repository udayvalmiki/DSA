import java.util.Arrays;
public class SearchIn2DArray{
    public static void main(String[] args){
        int[][] arr = {{4,-5,-6,7},{2,0,-3},{-5,-6,9,8,-7},{1,-1,2}};
          int[] ans = linearSearch(arr,-6); 
          System.out.println(Arrays.toString(ans));
          System.out.println(max(arr));
        }
        static int[] linearSearch(int[][] arr,int target){
            
            for(int i=0;i<arr.length;i++){
                for(int j=1;j<arr[i].length;j++){
                    if(arr[i][j] == target){
                        return new int[]{i,j};
                    }
                }
            }
                    return new int[]{-1,-1};

    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints:arr){
            for(int element:ints){
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }
}