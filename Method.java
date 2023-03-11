package lab7;

import java.util.Stack;

public class Method<T> {
    Stack<T>es= new Stack<>();
    public static void removeAll(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            stack.pop();
            removeAll(stack);
        }

    }
}

