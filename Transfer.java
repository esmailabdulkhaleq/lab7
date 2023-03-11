package lab7;
import java.util.Stack;
public class Transfer {


    public static void trans(Stack<Integer> x, Stack<Integer> y) {
        while (!x.isEmpty()) {
            y.push(x.pop());
        }
    }

    public static void main(String[] args) {
        // Create two stacks
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        // Push elements onto S
        S.push(1);
        S.push(2);
        S.push(3);

        // Transfer elements from S to T
        trans(S, T);

        // Print elements in T
        while (!T.isEmpty()) {
            System.out.println(T.pop());
        }
    }

}
