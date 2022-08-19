public class _394_Decode_String {
    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        if(s.indexOf("[") == -1){
            return s;
        }else {
            int i = 0;
            while (i < s.length()){
                if(s.charAt(i) >= 49 && s.charAt(i) < 58){
                    int key = s.indexOf("[", i+1);
                    int num = Integer.parseInt(s.substring(i, key));

                    i = key - 1;
                    int count = 1;
                    int j = i + 2;

                    while (count != 0){
                        if(s.charAt(j) == '[') count++;
                        if(s.charAt(j) == ']') count--;
                        j++;
                    }

                    String subString = s.substring(i+2, j-1);
                    String str = decodeString(subString);

                    for(int k = 0; k < num; k++){
                        result.append(str);
                    }
                    i = j;
                }else if(s.charAt(i) != '[' && s.charAt(i) != ']'){
                    result.append(s.substring(i, i+1));
                    i++;
                }else{
                    i++;
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }



}