import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(100);
    }

    @Test
    public void printerHasTotalRemainingSheets() {
        assertEquals(100, printer.getRemainingSheets());
    }

    @Test
    public void printDoesNotRunIfNotEnoughPaper() {
        printer.print(20, 6);
        assertEquals(100, printer.getRemainingSheets());
    }

    @Test
    public void printDoesRunIfEnoughPaper() {
        printer.print(5, 4);
        assertEquals(80, printer.getRemainingSheets());
    }

}
