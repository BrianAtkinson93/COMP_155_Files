import java.util.Iterator;

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

    public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println("element[" + i + "] = " + pop());
        }
    }

    public boolean hasElement(E element) {
        for (Elem<E> current = top; current != null; current = current.next) {
            if (current.value.equals(element)) {
                return true;
            }
        }
        return false;
    }


    public void push(E obj) {
        top = new Elem<E>(obj, top);
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