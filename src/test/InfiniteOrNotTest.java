package test;

import com.company.InfiniteOrNot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfiniteOrNotTest {
    @Test
    public void d1f_ToDouble0(){
        assertEquals(1, InfiniteOrNot.d1f_ToDouble0 (1));
        }
@Test
    public void d2f_ToDouble0() {
        assertEquals(0, InfiniteOrNot.d2f_ToDouble0(0));
    }
    @Test
    public void d3f_ToDouble0() {
        assertEquals(0, InfiniteOrNot.d3f_ToDouble0(0));
    }
    @Test
    public void f1f_ToDouble0() {
        assertEquals(1, InfiniteOrNot.f1f_ToDouble0(1));
    }
    @Test
    public void f2f_ToDouble0() {
        assertEquals(0, InfiniteOrNot.f2f_ToDouble0(0));
    }
    @Test
    public void f3f_ToDouble0() {
        assertEquals(0, InfiniteOrNot.f3f_ToDouble0(0));
    }

    }


