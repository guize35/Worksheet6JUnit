public class RetanguloTriangulo {

    public int area(int base, int altura) {
        return base * altura;
    }

    public int perimetro(int base, int altura) {
        return (base * 2) + (altura * 2);
    }

    public boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

}
