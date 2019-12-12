import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    void testAddition(){
        assertEquals(20, SimpleCalculator.add(4,2,6,8));
    }

    @Test
    void testAddition2(){
        assertEquals(9, SimpleCalculator.add(3,6));
    }
    @Test
    void testMulti(){
        assertEquals(11412, SimpleCalculator.multiplication(1902,6));
    }

    @Test
    void testMulti2(){
        assertEquals(36, SimpleCalculator.multiplication(2,2,3,3));
    }

}