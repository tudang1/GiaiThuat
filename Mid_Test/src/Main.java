import java.util.Arrays;

public class Main {
    //1512. Number of Good Pairs

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i =0;i<n-1;i++){
            for (int j = i+1; j<n;j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    //202. Happy Number
    public static boolean isHappy(int n) {
        if (n == 1 ){
            return true;
        }else{
            String s = String.valueOf(n);
            char[] temp = s.toCharArray();
            int sum =0;
            for (int i =0; i < temp.length; i++){
                sum = sum +(temp[i]*temp[i]);
            }
            return isHappy(sum);
        }
    }

    //724. Find Pivot Index
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i< nums.length;i++){
            sum += nums[i];
        }
        int leftSum = 0 ;

        for (int i = 0; i < nums.length;i++){
            sum -= nums[i];
            if (sum == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    // 36. Valid Sudoku
    public boolean isValidSudoku(char[][] board) {
        int rowMax,columnMax;
        for (int x =0; x <9;x++){
            for (int y = 0;y<9;y++){
                if (board[x][y] != '.'){
                    // hàng
                    for (int k = y+1; k< 9; k++ ){
                        if (board[x][y] == board[x][k]) {
                            return false;
                        }
                    }
                    // cột
                    for (int k = x+1; k< 9; k++ ){
                        if (board[x][y] == board[k][y]) {
                            return false;
                        }
                    }
                    // box
                    rowMax = ((x / 3) * 3) + 2;
                    columnMax = ((y / 3) * 3) + 2;
                    for (int k = rowMax; k >= rowMax - 2; k--) {
                        for (int l = columnMax; l >= columnMax - 2; l--) {
                            if (x != k && y != l && board[x][y]==board[k][l]){
                                return false;
                            }
                        }
                    }
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] n = {2,1,-1};
        System.out.println(pivotIndex(n));
    }

}
