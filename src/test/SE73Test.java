package test;

import com.company.SE73;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SE73Test {

    @AfterEach
    void tearDown() {
    }

    @Test
    void abcBeforePeriod() {
        Assertions.assertEquals(true, SE73.abcBeforePeriod("testabc.test"));

    }
}