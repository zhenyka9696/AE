package test;

import com.company.MathE18;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathE18Test {

    @Test
    void count_nums_not_7() {
    assertEquals(1, MathE18.count_nums_not_7(1));
    }
}