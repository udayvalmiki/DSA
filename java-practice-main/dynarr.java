public class dynarr{
    public static void main(String[] args){
        int[][] arr= {{1,2,3},{4,5},{5,6,7},{7,8,9,10}};
        for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            System.out.print(arr[row][col]+" ");
        }
        System.out.println(" ");
    }
    }
    // int[][] arr = input();
    // output(arr);
    // }
    // static int input(){
    //     Scanner sc = new Scanner(System.in);
    //     for(int row=0;row<arr.length;row++){
    //         for(int col=0;col<arr[row].length;col++){
    //             int[][] arr = sc.nextInt();
    //         }
    //     }
    //     return arr;
    // }
    // static void input(int[][] arr){
    //     Scanner sc = new Scanner(System.in);
    //     for(int row=0;row<arr.length;row++){
    //         for(int col=0;col<arr[row].length;col++){
    //             System.out.print(arr[row][col]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
}