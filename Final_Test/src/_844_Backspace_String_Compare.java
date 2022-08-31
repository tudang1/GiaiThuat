import java.util.Stack;

public class _844_Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {

    return loc(s).equals(loc(t));
    }
    public String loc(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i<s.length();i++){
            char temp =s.charAt(i);
            if (temp != '#'){
                st.push(temp);
            }else if (!st.empty())
                st.pop();
        }
        return String.valueOf(st);
    }
}
