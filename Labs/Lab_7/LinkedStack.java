public class LinkedStack<E> implements Stack<E> {

    //definition of an inner class
    private static class Elem<E> {
        private E value;
        private Elem<E> next;

        public Elem(E value, Elem<E> next) {
            this.value = value;
            this.next = next;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public void setNext(Elem<E> next) {
            this.next = next;
        }

        public E getValue() {
            return value;
        }

        public Elem<E> getNext() {
            return next;
        }
    }

    private Elem<E> top;

    public boolean isEmpty() {
        return top == null;
    }


    // Here we simply print out the items to the user.
    public void display() {
        int i = 0;
        for (Elem<E> iterator = top; iterator != null; iterator = iterator.next) {
            System.out.println("element[" + i + "] = " + iterator.value);
            i++;
        }
    }

    // here we search the stack for the parameter
    // without popping so we retain the stack. The
    // boolean returns true if the parameter is
    // found otherwise the boolean returns false
    public boolean hasElement(E element) {
        for (Elem<E> iterator = top; iterator != null; iterator = iterator.next) {
            if (iterator.value.equals(element)) {
                return true;
            }
        }
        return false;
    }


    public void push(E obj) {
        top = new Elem<>(obj, top);
    }

    public E peek() {
        return top.value;
    }

    public E pop() {
        E saved = top.value;
        top = top.next;
        return saved;
    }

}