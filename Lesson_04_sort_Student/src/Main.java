import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nguyễn Văn A",23,4));
        list.add(new Student("Nguyễn Văn A",22,5));
        list.add(new Student("Nguyễn Thị C",18,7));
        list.add(new Student("Đặng Văn A",27,7));
        list.add(new Student("Trần Thị C",20,6));
        list.add(new Student("Nguyễn Hương L",22,7));
        list.add(new Student("Trần Thị E",14,5));

        //sắp xếp theo tên
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int compareByname = o1.getName().compareTo(o2.getName());
//                System.out.println(o1.getName()+ "-" + o2.getName() + " - "+ compaerByname);
                if (compareByname == 0){
                    // tên giống nhau
                    return o2.getAge() - o1.getAge();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        // sắp xếp hsinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần
        
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int temp = o1.getAge() - o2.getAge();
                if (temp ==0){
                    return o2.getGPA() - o1.getGPA();
                }
                return temp;
            }
        });
        // sắp xếp theo tên
        // dùng split sẽ phải tạo thêm mảng trung gian để chưa các phần tử bị cắt và dẫn đến chiếm bộ nhớ nhiều
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int spaceIdx1 = o1.getName().lastIndexOf(" ");
                String subStr1 = o1.getName().substring(spaceIdx1 + 1);

                int spaceIdx2 = o2.getName().lastIndexOf(" ");
                String subStr2 = o2.getName().substring(spaceIdx2 + 1);

                return subStr1.compareTo(subStr2);
            }
        });
        
        print(list);
    }
    public static void print(ArrayList<Student> list){
        for (Student i : list){
            System.out.println(i);
        }
    }
}
