public class Ceiling {
    public static void main(String[] args) {
        // int[] arr = {2,3,5,9,14,16,18};
        int[] arr = { 0, 1, 2, 3, 4, 5, 5, 7, 9 };
        // int[] arr ={99,88,55,33,10,5,-3};
        System.out.println(ceiling(arr, 10));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;

    }
}