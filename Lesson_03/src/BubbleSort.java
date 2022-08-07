import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] arr){
        int n = arr.length;
        for (int i =0;i<n;i++){
            for (int j =0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("lần thứ "+ i);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static int[] sortArray(int[] arr){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i=0 ;i <arr.length -1 ;i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={4,1,3,5,2};
//        sort(arr);
//        System.out.println(Arrays.toString(sort(arr)));
        sortArray(arr);
    }
}
