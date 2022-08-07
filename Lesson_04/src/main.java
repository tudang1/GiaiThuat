public class main {
    public static void main(String[] args) {
        System.out.println(giaithua(4));

    }
    public static int giaithua(int x){
        int n = 1;
        if(x == 0){
            for (int i = 1; i <= x ; i++){
                n = n*i;
            }
            return n;
        }else if(x == 0){
            return n;
        }
        return n;
    }
    //công thức đệ quy
    public static int factorialUsingRecusion(int n){
        // điều kiện dùng
        if(n == 0){
            return 1;
        }
        // cong thức đệ quy
        return n * factorialUsingRecusion(n-1);
    }


}
