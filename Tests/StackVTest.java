import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackVTest {

    @Test
    void pop() {
        StackVector<Integer> test = new StackVector<Integer>();
        test.push(4);
        test.push(9);

        int res = test.pop();

        assertEquals(9, res);
    }

    @Test
    void push() {
        StackVector<Integer> test = new StackVector<Integer>();
        test.push(4);
        test.push(2);

        int res = test.pop();

        assertEquals(2, res);
    }
}