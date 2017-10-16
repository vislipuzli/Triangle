import java.util.HashMap;

public class UnitTest {

    public static void main(String[] args) {

        //задаем координаты треугольника
        int getApexX1 = 1;
        int getApexY1 = 2;
        int getApexX2 = 8;
        int getApexY2 = 3;
        int getApexX3 = 2;
        int getApexY3 = 5;

        // создаем трегуольник
        Triangle.createTriangle(getApexX1, getApexY1, getApexX2, getApexY2, getApexX3, getApexY3);

        //создаем квадрат из координат треугольника
        Square.createSquare(Triangle.createTriangle(getApexX1, getApexY1, getApexX2, getApexY2, getApexX3, getApexY3));

    }
}
