import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RetanguloTrianguloTest {

    @Test
    public void areaTest1() {
        RetanguloTriangulo calculoArea = new RetanguloTriangulo();
        int actual = calculoArea.area(3,5);
        int expected = 15;
        assertEquals (actual, expected, "Erro no cálculo da área!");
    }

    @Test
    public void areaTest2() {
        RetanguloTriangulo calculoArea = new RetanguloTriangulo();
        int actual2 = calculoArea.area(5,8);
        int expected2 = 40;
        assertEquals (actual2, expected2, "Erro no cálculo da área!");
    }

    @Test
    public void areaTest3() {
        RetanguloTriangulo calculoArea = new RetanguloTriangulo();
        int actual3 = calculoArea.area(2,4);
        int expected3 = 8;
        assertEquals (actual3, expected3, "Erro no cálculo da área!");
    }


    @Test
    public void perimetroTest1() {
        RetanguloTriangulo calculoPerimetro = new RetanguloTriangulo();
        int actual4 = calculoPerimetro.perimetro(3,5);
        int expected4 = 16;
        assertEquals (actual4, expected4, "Erro no cálculo do perimetro!");
    }

    @Test
    public void perimetroTest2() {
        RetanguloTriangulo calculoPerimetro = new RetanguloTriangulo();
        int actual5 = calculoPerimetro.perimetro(5,8);
        int expected5 = 26;
        assertEquals (actual5, expected5, "Erro no cálculo do perimetro!");
    }

    @Test
    public void perimetroTest3() {
        RetanguloTriangulo calculoPerimetro = new RetanguloTriangulo();
        int actual6 = calculoPerimetro.perimetro(2,4);
        int expected6 = 12;
        assertEquals (actual6, expected6, "Erro no cálculo do perimetro!");
    }

    @Test
    public void isTriangleTest() {
        RetanguloTriangulo eTriangulo = new RetanguloTriangulo();
        int a = 2;
        int b = 3;
        int c = 4;
        boolean result = eTriangulo.isTriangle(a, b, c);
        assertTrue(result);
    }

}
