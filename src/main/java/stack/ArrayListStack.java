package stack;

import java.util.List;
import java.util.ArrayList;

public class ArrayListStack<T> implements Stack<T>{

    private List<T> stack;

    public ArrayListStack(){
        this.stack = new ArrayList<T>(){

            @Override
            public String toString(){
            StringBuilder sb = new StringBuilder();
            stack.forEach( e -> sb.append(e.toString()).append("\n"));
            return sb.toString();
            }
        };
    }

    @Override
    public boolean empty() {
        return this.stack.isEmpty();
    }

    public T peek(){
        return this.stack.getFirst();
    }

    @Override
    public T pop() {
        return this.stack.removeFirst();
    }

    @Override
    public void push(T item) {
        this.stack.addFirst(item);
    }

    @Override
    public int search(T element) {
        int index = this.stack.indexOf(element);
        if (index == -1) {
            return -1;
        } else{
            // this is 1 based not 0 based lists.
            return index + 1;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("stack={");
        sb.append(stack);
        sb.append("}");
        return sb.toString();

    }
}
