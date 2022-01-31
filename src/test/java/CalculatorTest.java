import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(7, calculator.add(4, 3));
    }

    @Test
    public void canSubtract() {
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    public void canMultiply() {
        assertEquals(18, calculator.multiply(6, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(2.4, calculator.divide(12, 5), 0.0);
    }
}
