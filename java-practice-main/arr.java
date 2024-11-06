// import java.util.Arrays;

// public class arr {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         change(arr);
//         // System.out.print(Arrays.toString(arr));
//         fun(2,5,95,4,4,5,5,5,4,68,4,8,84);

//     }

//     static void change(int[] nums) {
//         nums[0] = 99;
//     }
//     static void fun(int a, int b,int...v){

//     System.out.print(a + " " + b + " " + Arrays.toString(v));

//     }
// }

public class arr {
    public static void main(String[] args) {
        // Create and initialize a 3D array
        int[][][] array3D = {
                { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } },
                { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
                { { 20, 21, 22 }, { 23, 24, 25 }, { 26, 27, 28 } }
        };

        // Printing the 3D array
        for (int i = 0; i < 3; i++) {
            System.out.println("Layer " + i);
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
