public class EvenDigits{
    public static void main(String[] args){
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        // System.out.println(digit2(78965));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digit(num);
        // if(numberOfDigits % 2 == 0){
        //     return true;
        // }
        // return false;
        return numberOfDigits %2 == 0;
    }
    static int digit2(int num){
        return (int)(Math.log10(num)+1);
    }
    static int digit(int num){
        int count = 0;

        if(num<0){
            num*=-1;
        }
        if(num == 0){
            return 1;
        }

        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
}