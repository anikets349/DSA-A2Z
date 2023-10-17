import java.util.Stack;

/*
 * Methods:
 * push
 * pop
 * peek
 * size
 * isEmpty
*/

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);
        System.out.println(st.size());

        System.out.println(st.peek());

        System.out.println(st.isEmpty());

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

        System.out.println(st);
    }
}
