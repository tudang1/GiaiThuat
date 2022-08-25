import java.util.HashMap;

public class _205_Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hashMap = new HashMap<>();
        for (int i =0 ; i < s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            System.out.println(ch1 + " - " + ch2);
            //containsKey or ContainsValue để xác nhận xem phần tử đã tồn tại hay chưa
            if (hashMap.containsKey(ch1)){
                if (hashMap.get(ch1) != ch2){
                    return false;
                }
            }else if(hashMap.containsValue(ch2)){
                return false;
            }else {
                hashMap.put(ch1,ch2);
            }

            //1: ktra đã tồn tại key ch1 trong hashMap hay chưa
            // chưa tồn tại
            //1,1 ktra tồn tại value ch2 chưa
            // -> nếu tồn tại > false
            // -> chưa tồn tại thì put()
            // đã tồn tại key ch1
            //1.2 ktra key ch1 với value ch2
        }
        return true;
    }
}
