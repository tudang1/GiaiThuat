public class _50_Pow {
    public static double myPow(double x, int n) {
        if(n == 0) return (double)1;
        if(n < 0){
            double temp = x * myPow(x, -n - 1);
            return 1/temp;
        }
        return (n % 2 == 0 ? myPow(x * x , n / 2) : x * myPow(x * x , n / 2));
    }

    public static void main(String[] args) {

        System.out.println(myPow(0.44528,0));
    }
}
