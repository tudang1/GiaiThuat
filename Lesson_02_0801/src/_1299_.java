import java.util.Arrays;

public class _1299_ {
    public static int[] replaceElements(int[] arr) {
        int[] arrclone = new int[arr.length];
        arrclone[arr.length - 1] = -1;
        for (int i = 0;i<arr.length - 1;i++){
            //tìm max
            //giả định giá trị của max
            int max = Integer.MIN_VALUE;
            for (int j= i+1;j<arr.length;j++){
                max = Math.max(max,arr[j]);
            }
            arrclone[i] = max;
        }
        return arrclone;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
