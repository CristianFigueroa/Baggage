import proyecto.Baggage;

import static org.junit.Assert.*;

public class BaggageTest {

    @org.junit.Test
    public void ordenar1() {
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

    @org.junit.Test
    public void ordenar2() {
        Baggage b = new Baggage(15);
        String esperado =
                "28 to -1\n" +
                "3 to 28\n" +
                "24 to 3\n" +
                "7 to 24\n" +
                "16 to 7\n" +
                "13 to 16\n" +
                "20 to 13\n" +
                "11 to 20\n" +
                "17 to 11\n" +
                "8 to 17\n" +
                "21 to 8\n" +
                "4 to 21\n" +
                "25 to 4\n" +
                "0 to 25\n" +
                "29 to 0\n";

        assertEquals(esperado, b.getResultado());
    }
}