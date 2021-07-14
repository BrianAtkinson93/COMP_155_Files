public class ArrayStack<E> implements Stack<E> {
    private E[] elements;
    private int top;
    private static final int increment = 5;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        elements = (E[]) new Object[capacity];
        top = 0;
    }

    @SuppressWarnings("unchecked")
    public void push(E element) {
        int capacity = elements.length;
        if (top == capacity) {
            E[] temp = (E[]) new Object[capacity + increment];
            System.arraycopy(elements, 0, temp, 0, top);
            elements = temp;
        }
        elements[top++] = element;
    }

    public E pop() {
        E element = null;
        if (!isEmpty()) {
            element = elements[top - 1];
            elements[top - 1] = null;
            top--;
        }
        return element;
    }

    public E peek() {
        return elements[top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return elements.length;
    }

    // Here we simply print out the items to the user.
    public void display() {
        for (int i = 0; i < size(); i++) {
            System.out.println("elements[" + i + "]: " + elements[top - i - 1]);
        }
    }

    // here we search the stack for the parameter
    // without popping so we retain the stack. The
    // boolean returns true if the parameter is
    // found otherwise the boolean returns false
    public boolean hasElement(E element) {
        for (E e : elements) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
