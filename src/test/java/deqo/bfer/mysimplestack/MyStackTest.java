package deqo.bfer.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    private MyStack stackEmpty;
    private MyStack stack;
    private Item item;

    @Before
    public void setUp() throws Exception {
        stackEmpty = new MyStack();
        item = new Item();
    }

    @Test
    public void isEmpty() {
        assertTrue("bug isEmpty", stackEmpty.isEmpty());
    }

    @Test
    public void getSize() {
        stack = new MyStack();
        stack.push(item);
        assertEquals("but getSize", 1, stack.getSize());
    }

    @Test
    public void push() {
        stack = new MyStack();
        stack.push(item);
        assertSame(item, stack.peek());
    }

    @Test
    public void peek() {
        stack = new MyStack();
        stack.push(item);
        assertSame(stack.peek(), item);
    }

    @Test
    public void pop() {
        stack = new MyStack();
        stack.push(item);
        assertSame(item, stack.pop());
    }
}