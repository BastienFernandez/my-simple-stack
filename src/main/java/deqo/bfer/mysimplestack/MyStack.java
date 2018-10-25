package deqo.bfer.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack implements  SimpleStack{

    private ArrayList<Item> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getSize() {
        return stack.size();
    }

    public void push(Item item) {
        stack.add(item);
    }

    public Item peek() throws EmptyStackException {
        /*try {
            stack.get(0);
        } catch (EmptyStackException e) {
            //throw new EmptyStackException();
        }*/
        return stack.get(0);
    }

    public Item pop() throws EmptyStackException {
        int size = stack.size();
        Item item = stack.get(size);

        stack.remove(size);
        return item;
    }
}
