package test;
import com.company.Arrays10;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Arrays10Test {
@Test
    public void miniMax(){
    assertEquals(12, Arrays10.mini(new int[] {25,12,56,15,36,56,79,18,29,49}));
    assertEquals(79, Arrays10.maxi(new int[] {25,12,56,15,36,56,79,18,29,49}));
    }
}