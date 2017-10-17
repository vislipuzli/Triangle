
public class UnitTest {

    public static void main(String[] args) {

        //задаем координаты треугольника
        int getApexX1 = 7;
        int getApexY1 = 8;
        int getApexX2 = 10;
        int getApexY2 = 9;
        int getApexX3 = 7;
        int getApexY3 = 15;

        // создаем трегуольник
        Triangle.createTriangle(getApexX1, getApexY1, getApexX2, getApexY2, getApexX3, getApexY3);

        //создаем квадрат из координат треугольника
        Square.createSquare(Triangle.createTriangle(getApexX1, getApexY1, getApexX2, getApexY2, getApexX3, getApexY3));

    }

}
