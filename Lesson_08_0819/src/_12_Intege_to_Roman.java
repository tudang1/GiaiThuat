public class _12_Intege_to_Roman {
    public String intToRoman(int num) {
        String[] arr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] intArr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder str = new StringBuilder();
        for (int i =0 ; i<arr.length;i++){
            while (num >= intArr[i]){
                str.append(arr[i]);
                num = num - intArr[i];
            }
        }
    return str.toString();
    }
}
