import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

    @Test
    public void testValorNegativo() {
        ASumar sumi = new ASumar("-5");
        String resultado = sumi.mostrar();
        assertEquals("-5 = 0",resultado );
    }
}
