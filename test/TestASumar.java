import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

    @Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar("54");
        String resultado = sumi.mostrar();
        int resultadoValorSumado = sumi.total();
        assertEquals("54 = "+resultadoValorSumado,resultado );
    }

}
