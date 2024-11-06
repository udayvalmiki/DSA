import java.util.Scanner;
import java.util.Arrays;
public class twodarr{
    public static void main(String[] args){
       int[][] arr = input();
        output(arr);
    }
    static int[][] input(){
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    static void output(int[][] arr){
        
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int row=0;row<arr.length;row++){
            // for(int[] a:arr){
            System.out.println(Arrays.toString(arr[row]));

        }
    }
}

// import java.util.Scanner;
// import java.util.Arrays;

// public class twodarr {
//     public static void main(String[] args) {
//         int[][] arr = input();
       

//         output(arr);
//     }

//     static int[][] input() {
//         Scanner sc = new Scanner(System.in);
//         int[][] arr = new int[3][2];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         return arr;
//     }

//     static void output(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
