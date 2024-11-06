import java.util.Scanner;

// public class simple {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your name:");
//         String name = scanner.nextLine();
//         System.out.println("Hello, " + name + "!");
//         scanner.close();
//     }
// }
public class simple {
    public static void main(String[] args){
        int resp = sum();
        System.out.print("Result:"+resp);

    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int res = a + b;
        return res;
        // System.out.print("Result:"+res);

    }
}