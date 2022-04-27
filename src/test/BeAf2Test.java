package test;
import com.company.BeAf2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BeAf2Test {
@Test
    public void AppearingTest (){
assertEquals("Yes!", BeAf2.firstInLast(new String("educated") ));
    assertEquals("No!", BeAf2.firstInLast(new String("educating") ));
  }
}