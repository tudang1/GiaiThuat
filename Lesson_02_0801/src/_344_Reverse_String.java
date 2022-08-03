public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        // cách 1: 2 con trỏ
        int i = 0;
        int j = s.length -1 ;
        char x;
        while (i < j){
            // tạo 1 biến trung gian để lưu dữ liệu
            x = s[i];
            s[i] = s[j];
            s[j] = x;
            i++;
            j--;
        }
        //cách 2
//        for (int t=0; t< s.length/2; t++){
//            char temp = s[t];
//            s[t] = s[s.length-1-t];
//            s[s.length-1-t] = temp;
//        }
        return;
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
}
