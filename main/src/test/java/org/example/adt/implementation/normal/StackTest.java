package org.example.adt.implementation.normal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    @DisplayName("Should add an arbitrary element succesfully")
    public void add() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());

        stack.add(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getTop());

        stack.add(2);
        assertEquals(2, stack.getTop());
        stack.remove();
        assertEquals(1, stack.getTop());


    }

}
