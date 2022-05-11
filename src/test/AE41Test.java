package test;

import com.company.AE41;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AE41Test {

    @Test
    void FE() {
      assertEquals(-8, AE41.FE(new int[]{5,7,-8,5,14,1}));
    }

    @Test
    void SE() {
        assertEquals(1,AE41.SE(new int[]{5,7,-8,5,14,1}));
    }
}