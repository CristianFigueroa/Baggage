import Proyecto.Baggage;

import static org.junit.Assert.*;

public class BaggageTest {

    @org.junit.Test
    public void ordenar() {
        Baggage b = new Baggage(8);
        String esperado =
                "14 to -1\n" +
                "3 to 14\n" +
                "10 to 3\n" +
                "7 to 10\n" +
                "4 to 7\n" +
                "11 to 4\n" +
                "0 to 11\n" +
                "15 to 0\n";
        assertEquals(esperado, b.getResultado());
    }
}