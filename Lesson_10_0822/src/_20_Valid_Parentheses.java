import java.util.Stack;

public class _20_Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length()%2 != 0){
            return false;
        }else {
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if (temp == '(' || temp == '[' || temp == '{') {
                    // st.push() là thêm phần tử vào st
                    st.push(temp);
                } else {
                    //xét xem st đã có phần tử nào chưa để so sánh xóa
                    if(st.size() == 0)return false;
                    if (temp == ')' && st.pop() != '('){
                        return false;
                    }
                    if (temp == ']' && st.pop() != '['){
                        return false;
                    }
                    if (temp == '}' && st.pop() != '{'){
                        return false;
                    }
                }

            }
        }
        // kiểm tra xem st của mình bị xóa(pop) hết chưa
        return st.size() ==0;
    }

}
