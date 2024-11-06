import java.util.Arrays;
public class LinearString{
    public static void main(String[] args){
        String str = "Akshai";
        char target = 'a';
        // System.out.println(LinearString(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean LinearString2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;

    }
    static boolean LinearString(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}