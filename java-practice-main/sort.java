public class sort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 0, 10, 12, 5, 6, 3, 11};
        srt(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void srt(int[] arr) {
        // int n = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i]-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


// import java.util.Arrays;

// public class sort {
//     public static void main(String[] args) {
//         int[] arr = {9, 5, 0, 10, 12, 5, 6, 3, 11};

//         // Sort the array
//         Arrays.sort(arr);

//         // Print the sorted array
//         System.out.println("Sorted array: " + Arrays.toString(arr));
//     }
// }
