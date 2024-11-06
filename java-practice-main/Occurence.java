import java.util.Arrays;

// public class Occurence {
//     public static void main(String[] args) {
//         int[] arr = {3, 2, 2, 4, 4, 4, 5, 6,4,4,4,4};
//         int target = 4;
//         int[] result = occurrence(arr, target);
//         System.out.println(Arrays.toString(result));
//     }

//     static int[] occurrence(int[] arr, int target) {
//         int firstIndex = -1;
//         int lastIndex = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 if (firstIndex == -1) {
//                     firstIndex = i;
//                 }
//                 lastIndex = i;
//             }
//         }

//         return new int[]{firstIndex, lastIndex};
//     }
// }

// public class Occurence {
//     public static void main(String[] args) {
//         int[] arr = {3, 2, 2, 4, 4, 4, 5, 6};
//         int target = 4;
//         int[] result = occurrence(arr, target);
//         System.out.println(Arrays.toString(result));
//     }

//     static int[] occurrence(int[] arr, int target) {
//         int firstIndex = findFirstIndex(arr, target);
//         int lastIndex = findLastIndex(arr, target);
//         return new int[]{firstIndex, lastIndex};
//     }

//     static int findFirstIndex(int[] arr, int target) {
//         int low = 0;
//         int high = arr.length - 1;
//         int firstIndex = -1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] >= target) {
//                 if (arr[mid] == target) {
//                     firstIndex = mid;
//                 }
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }

//         return firstIndex;
//     }

//     static int findLastIndex(int[] arr, int target) {
//         int low = 0;
//         int high = arr.length - 1;
//         int lastIndex = -1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] <= target) {
//                 if (arr[mid] == target) {
//                     lastIndex = mid;
//                 }
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }

//         return lastIndex;
//     }
// }

// import java.util.Arrays;

public class Occurence {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 4, 4, 4, 5, 6, 4, 4, 4, 4, 8, 8, 8, 4, 4, 4, 4, 4 };
        int target = 4;
        int[] result = greatestOccurrenceRange(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] greatestOccurrenceRange(int[] arr, int target) {
        int start = -1;
        int end = -1;
        int maxOccurrence = -1;
        int currentOccurrenceStart = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (currentOccurrenceStart == -1) {
                    currentOccurrenceStart = i;
                }
            } else {
                if (currentOccurrenceStart != -1) {
                    int currentOccurrenceLength = i - currentOccurrenceStart;
                    if (currentOccurrenceLength > maxOccurrence) {
                        maxOccurrence = currentOccurrenceLength;
                        start = currentOccurrenceStart;
                        end = i - 1;
                    }
                    currentOccurrenceStart = -1;
                }
            }
        }

        // Check for the last occurrence if it extends to the end of the array
        if (currentOccurrenceStart != -1) {
            int currentOccurrenceLength = arr.length - currentOccurrenceStart;
            if (currentOccurrenceLength > maxOccurrence) {
                start = currentOccurrenceStart;
                end = arr.length - 1;
            }
        }

        return new int[] { start, end };
    }
}
