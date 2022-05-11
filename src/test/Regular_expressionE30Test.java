package test;

import com.company.Regular_expressionE30;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Regular_expressionE30Test {

    @Test
    void validate0() {
        assertEquals("0", Regular_expressionE30.validate("Python Exercises"));
    }
    @Test
    void validate1() {
        assertEquals("1",Regular_expressionE30.validate("The quick brown Fox jumps over the lazy Dog."));
    }
    @Test
    void validate2() {
        assertEquals("2",Regular_expressionE30.validate("exercises"));
    }



}