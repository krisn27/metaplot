
import java.util.*;

public class r10 {

    public static void main(String args[]) {
        String s = "{[([])]}";
        System.out.println(bal(s));
    }

    static boolean bal(String s) {
        Stack<Character> sa = new Stack<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                sa.push(s.charAt(i));
                continue;
            }
            switch (s.charAt(i)) {
                case ')':
                    c = sa.peek();
                    sa.pop();
                    if (c == '{' || c == '[') {
                        return false;
                    }
                    break;

                case '}':
                    c = sa.peek();
                    sa.pop();
                    if (c == '[' || c == '(') {
                        return false;
                    }
                    break;

                case ']':
                    c = sa.peek();
                    sa.pop();
                    if (c == '(' || c == '{') {
                        return false;
                    }
                    break;
            }
        }
        return sa.isEmpty();
    }

}
