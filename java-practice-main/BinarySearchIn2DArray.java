import java.util.Arrays;
public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 11, 12, 13}
        };
        int target = 20;
        System.out.println(Arrays.toString(search(arr, target))); 
        
    }
    static int[] binarysearch(int[][] matrix, int target,int cStart,int cEnd, int row){
        while(cStart<=cEnd){
            int mid = cStart + (cStart-cEnd)/2;
            if(matrix[row][mid] ==  target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid+ 1;
            }
            else{
                cEnd = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        // If target is not found, return {-1, -1}
        return new int[]{-1, -1};
    }
}
