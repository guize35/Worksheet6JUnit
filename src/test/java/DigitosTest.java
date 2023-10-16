import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitosTest {

    private DigitosTest digitos;

    @BeforeEach
    public void setUp() {
        digitos = new DigitosTest();
    }

    @Test
    public void averageDigitsTest() {
        double actual = Digitos.calcluaMedia(12345);
        double expected = 3.0;
        assertEquals(expected, actual, 0.01);
    }


}
