package test;

import com.company.FileIOE6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileIOE6Test {

    @Test
    void var1() {
        assertEquals(0, FileIOE6.Var1("Java exercieses"));
    }

    @Test
    void var2() {
        assertEquals(4, FileIOE6.Var2("Java exercieses"));

    }
}