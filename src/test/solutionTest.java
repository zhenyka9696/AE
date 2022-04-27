package test;

import com.company.solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class solutionTest {
@Test
    public void find_max_product(){
 assertEquals(72, solution.find_max_product(new int[]{ 2, 3, 5, 9, -7, 5, 8, -5 }));

}
}