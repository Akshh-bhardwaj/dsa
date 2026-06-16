package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A custom generic Stack implementation demonstrating PECS (Producer Extends, Consumer Super).
 */
public class CustomGenericStack<T> {
    private List<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    /**
     * PECS: Producer Extends.
     * This stack is CONSUMING elements from the iterable 'src' (so 'src' is a PRODUCER of T).
     * We use `? extends T` so we can push items that are subclasses of T.
     */
    public void pushAll(Iterable<? extends T> src) {
        for (T item : src) {
            push(item);
        }
    }

    /**
     * PECS: Consumer Super.
     * The collection 'dst' is CONSUMING elements from this stack (so 'dst' is a CONSUMER of T).
     * We use `? super T` so we can pop items into collections that hold parent types of T.
     */
    public void popAll(Collection<? super T> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public static void main(String[] args) {
        CustomGenericStack<Number> stack = new CustomGenericStack<>();

        // Producer Extends: List of Integers can be pushed into Stack of Numbers
        List<Integer> integers = List.of(1, 2, 3);
        stack.pushAll(integers);

        // Consumer Super: We can pop items from Stack of Numbers into a list of Objects (parent of Number)
        List<Object> objects = new ArrayList<>();
        stack.popAll(objects);

        System.out.println("Popped items into Object collection: " + objects);
    }
}
