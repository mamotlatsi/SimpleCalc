import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    void testAdd(){
        assertEquals(15, SimpleCalculator.add(1,2,3,4,5));
        {
            assertEquals(4, SimpleCalculator.add(1,3));
        }
        {
            assertEquals(-2, SimpleCalculator.add(-1,-1));
        }

    }

    @Test
    void testMulti(){
        assertEquals(120, SimpleCalculator.multiplication(1,2,3,4,5));
        {
            assertEquals(3, SimpleCalculator.multiplication(1, 3));
            {

            }
                assertEquals(-3, SimpleCalculator.multiplication(-1, 3));
            }
    }



}