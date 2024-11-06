public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc = {{1, 3, 2}, {1, 2, 3},{9,8}};
        System.out.println(maxWealth(acc));
    }

    public static int maxWealth(int[][] acc) {
        int ans = Integer.MIN_VALUE;
        for (int[] cus : acc) {
            int sum = 0;
            for (int acts : cus) {
                sum += acts;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
