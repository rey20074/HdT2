import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void calculo() {
        Calculadora test = new Calculadora();

        String op = "2,+,4";
        int res = Integer.parseInt(test.Calculo(op));

        assertEquals(6,res);
    }
}