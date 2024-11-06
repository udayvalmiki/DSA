public class max_and_range{
    public static void main(String[] args){
        int[] a = {-2,0,1,-1,3,-3,5};
        System.out.println(max(a));
        System.out.println(maxRange(a,2,4));
    }
    static int max(int[] a){
            int maxi = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>maxi){
                maxi = a[i];
            }
        }
        return maxi;
    }
    static int maxRange(int[] a, int start, int end) {
    if (a == null) {
        return -1;
    }
    if (start >= end || start < 0 || end > a.length) {
        return -1;
    }
    int maxrange = a[start];
    for (int i = start+1; i < end; i++) { // Adjust loop to iterate from start to end - 1
        if (a[i] > maxrange) {
            maxrange = a[i];
        }
    }
    return maxrange;
}

}