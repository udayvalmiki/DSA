import java.util.Scanner;
import java.util.ArrayList;
public class arrlist{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<> (5);//(1) giving range is optional
        // list.add(10);//(2)
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // list.add(60);
        // list.add(70);
        // System.out.println(list.contains(55));
        // list.set(0,99);// index value and value(update)
        // list.set(9,99);//(no index for 9) wont work cuz it depends on (2) not on (1)
        // list.remove(2);
        // System.out.println(list);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
           System.out.println(list.get(i));//to print the element you need get that value by index
        }

    }

}