import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class seminar {
    public static void main(String[] args) {
        String str = "(wrw[ewr)]";
        System.out.println(ex2(str));
    }

    static boolean ex2(String s){
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        String[] c1 = new String[]{"()", "{}", "[]", "<>"};
        for (int i = 0; i < c1.length; i++) {
        String a = c1[i];
        map.put(a.charAt(1), a.charAt(0));
        }
        for (int i = 0; i < chars.length; i++) {
        if (map.containsValue(chars[i])){
        stack.push(chars[i]);
        }
        if (map.containsKey(chars[i])){
        if (stack.empty() || map.get(chars[i]) != stack.pop()){
        return false;
        }
        }
        }
        return stack.empty();
        }
        
}
