import java.util.Stack;

public class TwoStack {
    public static Stack<Integer> stackSold1(Stack<Integer> st, int element) {
        if (st.isEmpty()) {
            st.push(element);
            return st;
        } else {
            int val = st.pop();
            stackSold1(st, element);
            st.push(val);
            return st;
        }

    }   

    public static void main(String[] args) {
        Stack<Integer> testStack = new Stack<>();
        System.out.println(stackSold1(testStack, 9));
    }
}

