import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,1,3,5,2};
        sortArr(arr);
        System.out.println(Arrays.toString(sortArr(arr)));
    }
    public static int[] sortArr(int[] arr){
        int n =arr.length;
        //tìm index phần tử nhỏ nhất
        for(int i =0; i<n-1;i++){
            int minIdx = i;
            for (int j = i+1; j<n;j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            //hoán đổi vị trí
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
