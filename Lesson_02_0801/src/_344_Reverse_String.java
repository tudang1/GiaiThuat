public class _344_Reverse_String {
    public void reverseString(char[] s) {
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
    }

    public static void main(String[] args) {
        char[] s = {'h','c'};
    }
}
