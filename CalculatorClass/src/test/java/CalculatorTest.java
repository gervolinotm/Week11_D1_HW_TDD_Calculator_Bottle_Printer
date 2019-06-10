import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void canAdd(){
        assertEquals( 2, calculator.addition(1, 1), 0.01);
    }

    @Test
    public void canSub(){
        assertEquals(0, calculator.subtraction(1,1), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiplication(3,2), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.division(4,2), 0.01);
    }

}
