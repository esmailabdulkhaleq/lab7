package lab7;

import java.util.Arrays;
public class Array<T> implements Cloneable {
        private T[] ele;
        private int size;
        private static final int capacity = 10;

        @SuppressWarnings("unchecked")
        public Array() {
            ele = (T[]) new Object[capacity];
        }

        // other methods for ArrayStack class

        @Override
        public Array<T> clone() {
            try {
                Array<T> cloned = (Array<T>) super.clone();
                cloned.ele = Arrays.copyOf(ele, size);
                return cloned;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(); // should never happen
            }
        }
    }



