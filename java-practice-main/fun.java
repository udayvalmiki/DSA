import java.util.Scanner;

public class fun{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name =i.next();
        String personal =name(name);
    System.out.print(personal);
    }
    static String name(String namee){
        String h = "Hello! "+namee;
        return h;
    }
}