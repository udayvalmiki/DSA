import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7},
                          {10, 11, 16, 17},
                         {20, 21, 22, 60}};
                         int target = 25;

                    System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarysearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < rEnd) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid + 1;
            } else {
                rEnd = mid - 1;
            }
        }

        // If target is not in the middle column
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        // Check the adjacent columns
        if (target <= matrix[rStart][cMid - 1]) {
            return binarysearch(matrix, rStart, 0, cMid - 1, target);
        } else {
            return binarysearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
    }
}
