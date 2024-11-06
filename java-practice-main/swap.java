public class swap{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        
        Swap(20,10);
        System.out.print(a+" "+b);
    }
    static void Swap(int a,int b){
        int temp=a;
        a = b;
        b = temp;

    }
}