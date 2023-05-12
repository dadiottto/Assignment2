////////////////////////////////////////////////////////////////////
// Davide Diotto  2042334
// Nicola Preto   2042371
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint1(){
        assertEquals

                ("  ___   \n" +
                        "  |_ _|   \n" +
                        "   | |    \n" +
                        "   | |    \n" +
                        "   | |    \n" +
                        "  |___|   \n", RomanPrinter.print(1));
    }

    @Test
    public void testPrint5(){
        assertEquals
                ("_      _\n" +
                        "\\ \\    / /\n" +
                        " \\ \\  / / \n" +
                        "  \\ \\/ /  \n" +
                        "   \\  /   \n" +
                        "    \\/    \n", RomanPrinter.print(5));
    }

    @Test
    public void testPrint10(){
        assertEquals("  _  _  \n" +
                "  \\ \\ / / \n" +
                "   \\ V /  \n" +
                "   > <    \n" +
                "  / . \\   \n" +
                " // \\\\  \n", RomanPrinter.print(10));
    }

    @Test
    public void testPrint50(){
        assertEquals("  _       \n"+
                " | |      \n"+
                " | |      \n"+
                " | |      \n"+
                " | |__  \n"+
                " |__| \n", RomanPrinter.print(50));

    }

    @Test
    public void testPrint100(){
        assertEquals("   ___  \n"+
                "  / __| \n"+
                " | |      \n"+
                " | |      \n"+
                " | |__  \n" +
                "  \\___| \n", RomanPrinter.print(100));
    }

    @Test
    public void testPrint500(){
        assertEquals("  ___   \n"+
                " | __ \\   \n"+
                " | | | |  \n"+
                " | | | |  \n"+
                " | |__| |  \n"+
                " |___/  \n", RomanPrinter.print(500));
    }

    @Test
    public void testPrint1000(){
        assertEquals("  _  _  \n"+
                " |  \\/  | \n"+
                " | \\  / | \n"+
                " | |\\/| | \n"+
                " | |  | | \n"+
                " ||  || \n", RomanPrinter.print(1000));
    }

    @Test
    public void testPrintNull(){
        assertEquals("Il numero e' negativo/nullo e quindi non e' rappresentaile\n", RomanPrinter.print(0));
    }

    @Test
    public void testPrintNegative1(){
        assertEquals("Il numero e' negativo/nullo e quindi non e' rappresentaile\n", RomanPrinter.print(-1));
    }

    @Test
    public void testPrintNegative5(){
        assertEquals("Il numero e' negativo/nullo e quindi non e' rappresentaile\n", RomanPrinter.print(-5));
    }

    @Test
    public void testPrintNegative10(){
        assertEquals("Il numero e' negativo/nullo e quindi non e' rappresentaile\n", RomanPrinter.print(-10));
    }

    @Test
    public void testPrintNegative50(){
        assertEquals("Il numero e' negativo/nullo e quindi non e' rappresentaile\n", RomanPrinter.print(-50));
    }

    @Test
    public void testPrintNegative100(){
        assertEquals("Il numero e' negativo/nullo e quindi non e' rappresentaile\n", RomanPrinter.print(-100));
    }

    @Test
    public void testPrintNegative500(){
        assertEquals("Il numero e' negativo/nullo e quindi non e' rappresentaile\n", RomanPrinter.print(-500));
    }

    @Test
    public void testPrintNegative1000(){
        assertEquals("Il numero e' negativo/nullo e quindi non e' rappresentaile\n", RomanPrinter.print(-1000));
    }

    @Test
    public void testPrintAsciiArtWithII() {
        String expected =
                "  ___     ___   \n" +
                "  |_ _|     |_ _|   \n" +
                "   | |       | |    \n" +
                "   | |       | |    \n" +
                "   | |       | |    \n" +
                "  |___|     |___|   \n";
        String result = RomanPrinter.print(2);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithVV() {
        String wrong = "_      __      _\n"+
                "\\ \\    / /\\ \\    / /\n"+
                " \\ \\  / /  \\ \\  / / \n"+
                "  \\ \\/ /    \\ \\/ /  \n"+
                "   \\  /      \\  /   \n"+
                "    \\/        \\/    \n";
        String result = RomanPrinter.print(10);
        assertNotEquals(wrong, result);
    }

    @Test
    public void testPrintAsciiArtWithXX() {
        String expected ="  _  _    _  _  \n"+
                "  \\ \\ / /   \\ \\ / / \n"+
                "   \\ V /     \\ V /  \n"+
                "   > <       > <    \n"+
                "  / . \\     / . \\   \n"+
                " // \\\\   // \\\\  \n";
        String result = RomanPrinter.print(20);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithLL() {
        String wrong ="  _         _       \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |__   | |__  \n"+
                " |__|  |__| \n";
        String result = RomanPrinter.print(100);
        assertNotEquals(wrong, result);
    }

    @Test
    public void testPrintAsciiArtWithCC() {
        String expected ="   ___     ___  \n"+
                "  / __|   / __| \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |__   | |__  \n"+
                "  \\___|   \\___| \n";
        String result = RomanPrinter.print(200);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithDD() {
        String wrong ="  ___     ___   \n"+
                " | __ \\    | __ \\   \n"+
                " | | | |   | | | |  \n"+
                " | | | |   | | | |  \n"+
                " | |__| |   | |__| |  \n"+
                " |___/   |___/  \n";
        String result = RomanPrinter.print(1000);
        assertNotEquals(wrong, result);
    }

}