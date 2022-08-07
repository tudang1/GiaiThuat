import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,1,3,5,2};
        sortArray(arr);
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    private static int[] sortArray(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j = i-1;
            while (j>=0&& arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
