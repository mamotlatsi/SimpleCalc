import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculationTest {

    @Test
    void testAddition(){
        assertEquals(20, SimpleCalculation.add2(4,2,6,8));
    }

    @Test
    void testAddition2(){
        assertEquals(9, SimpleCalculation.add(3,6));
    }
    @Test
    void testMulti(){
        assertEquals(11412, SimpleCalculation.multiply(1902,6));
    }

    @Test
    void testMulti2(){
        assertEquals(36, SimpleCalculation.multiply2(2,2,3,3));
    }

}