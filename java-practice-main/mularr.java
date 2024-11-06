import java.util.ArrayList;
import java.util.Scanner;
public class mularr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<> ();

        for(int i=0;i<5;i++){
            list.add(new ArrayList<> ());   /*initially the arraylist will be consisting if 
                                    null so we need to initialize it by another arraylist cuz its arr*/
        
        }
        for(int i=0;i<4;i++){
            System.out.println("For first array:"+(i+1));
            int n = sc.nextInt();
            for(int j=0;j<n;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}