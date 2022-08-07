public class _509_Fibonacci_Number {
    public static int fib(int n) {
        int f0 =0;
        int f1=1;
        int fn=1;
        if ( n ==0 || n == 1){
            return n;
        }else {
            for(int i=2; i < n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fibRecusion(5));
    }

    //đệ quy
    public static int fibRecusion(int n){
        // đk dừng
        if(n==0||n==1){
            return n;
        }else{
            // công thức đệ quy
            return fibRecusion(n-1) + fibRecusion(n-2);
        }
    }
    // tạo điều kiện dừng hợp lý
    public static void method(int count){
        count ++;
        if(count <= 5){
            System.out.println("tu");
            method(count);
        }
    }
}
