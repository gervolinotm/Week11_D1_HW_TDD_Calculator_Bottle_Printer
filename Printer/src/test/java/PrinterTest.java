import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaperLeft(){
        assertEquals(50, printer.numberOfPaper());
    }

    @Test
    public void hasTonerLeft(){
        assertEquals(30, printer.volumeOfToner());
    }

    @Test
    public void canPrintPaper(){
        printer.print(20, 1);
        assertEquals(30, printer.numberOfPaper());
        assertEquals(10, printer.volumeOfToner());
    }

    @Test
    public void canPrintPaperStatement(){
        assertEquals( "You have 30 pieces of paper left and 10 volumes of toner left.",printer.print(20, 1));
    }

    @Test
    public void cannotPrintPaperWithMoreThan30Pages(){
        assertEquals("Not Enough Resources!!", printer.print(20, 2));
        assertEquals(50, printer.numberOfPaper());
        assertEquals(30, printer.volumeOfToner());
    }

    @Test
    public void cannotPrintPaperWithMoreThan50Pages() {
        assertEquals("Not Enough Resources!!", printer.print(20, 3));
        assertEquals(50, printer.numberOfPaper());
        assertEquals(30, printer.volumeOfToner());
    }

}
