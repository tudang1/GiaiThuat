import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {3,4,5,7,2,9};

//        int[] arr1 = insertFirst(arr,3);
//        show(arr1);
//        System.out.println();
//
//        int[] result3 = insert(arr,5,2);
//        show(result3);
//        System.out.println();
//
//        int result4 = search(arr,4);
//        System.out.println(result4);
//        System.out.println();

        //delete
        int[] result5 = delete(arr,2);
        show(result5);
    }
    // show
    public static void show(int[] arr){
        for (int i : arr){
            System.out.print(i + "\t");
        }
    }
    // thêm phần tử dào đầu danh sách
    public static int[] insertFirst(int[] arr,int x){
        int n = arr.length +1 ;
        // tạo mảng kết quả
        int[] result = new int[n];
        // thêm phần tử vào trong mảng
        for (int i=0;i<arr.length;i++){
            result[i+1]=arr[i] ;
        }
        result[0]=x;

        return result;
    }
    // thêm vào cuối danh sách
    public static int[] insertLast(int[] arr,int x){
        int n = arr.length + 1;
        // tạo mảng kết quả
        int[] result = new int[n];
        for(int i =0;i< n ;i++){
            if (i != (n-1)){
                result[i] = arr[i];
            }else {
                result[i] = x;
            }
        }
        return result;
    }
    // thêm vào vị trí bất kỳ
    public static int[] insert(int[] arr ,int x, int position){
        int n = arr.length + 1;
        // sao chép mảng copyof
        int[] result = Arrays.copyOf(arr,n);
        // kiểm tra vị trí thêm
        if(position >= 0 && position <=(n-1)){
            for (int i = n -1; i<position; i --){
                result[i] = result[i-1];
            }
            result[position] = x;
        }

        return result;
    }

    // xóa phần tử và trả về số phần tử còn lại
    public static int[] delete(int[] arr, int x){
        int n = arr.length - 1;
        //tìm phần tử cần xóa
        int position = search(arr,x);
        int [] result = new int[n];
        //th1: k tìm thấy phần tử cần xóa
        if (search(arr,x) == -1){
            System.out.println("Phần tử k tồn tại");
        }else {
            // TH 2: tìm thấy phần tử cần xóa
            for (int i = 0;i < n;i++){
                if (i >= position){
                    result[i] = arr[i+1];
                }else{
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }

    public static int search(int[] arr, int x) {
        int position = -1;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == x) {
                position = i;
            }

        }
        System.out.println();
        return position;
    }
}
