public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgonisticBS(arr, target, 0, peak);
        if (firstTry!= -1) {
            return firstTry;
        }
        return OrderBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    private static int OrderAgonisticBS(int[] arr, int target, int i, int peak) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'OrderAgonisticBS'");
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int OrderBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}