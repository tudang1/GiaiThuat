public class StringBuilderEXP {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("java");
        System.out.println(str);
        // nối chuỗi
        str.append("abc");
        System.out.println(str);
        //chèn vào vị trí xác định
        str.insert(2,"tu");
        System.out.println(str);
        // thay thế tại vị trí, khoảng đầu cuối
        str.replace(2,5,"TU323");
        System.out.println(str);
        // đào ngược chuỗi
        str.reverse();
        System.out.println(str);
    }
}
