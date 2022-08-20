import java.util.Arrays;

public class _9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        //Cách 1 - StringBuilder
//        String arr = Integer.toString(x);
//        StringBuilder str = new StringBuilder(arr);
//        str.reverse();
//        return str.toString().equals(arr);
        // cách 2
        if(x < 0){
            return false;
        }
        int revNumber = 0;
        int org = x;
        while(x != 0){
            revNumber = revNumber*10 + x%10;
            x = x/10;
        }
        if(revNumber == org){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int x = 122;
        System.out.println(isPalindrome(x));
    }
}
