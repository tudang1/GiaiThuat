public class _202_Happy_Number {
    public static boolean isHappy(int n){
        while (n >= 10){
            int temp = n;
            n = 0;

            while (temp != 0){
                n += Math.pow((temp%10), 2);
                temp = temp/10;
            }
        }

        return n == 1 || n == 7;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(49));
    }
}