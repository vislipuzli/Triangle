
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Square {
    public static void createSquare(Map mapTriangle) {
        int[] squareX = {(int) mapTriangle.get("getApexX1"), (int) mapTriangle.get("getApexX2"), (int) mapTriangle.get("getApexX3")};
        int[] squareY = {(int) mapTriangle.get("getApexY1"), (int) mapTriangle.get("getApexY2"), (int) mapTriangle.get("getApexY3")};
        Arrays.sort(squareX);
        Arrays.sort(squareY);
        createTrianglesFromSquare(squareX, squareY); //отсылаем отсортированные координаты треугольника
    }

    private static void createTrianglesFromSquare(int[] squareX, int[] squareY) {
        HashMap<String, Integer> mapTriangle1 = new HashMap(); //создаем первый треугольник из квадрата
        HashMap<String, Integer> mapTriangle2 = new HashMap();//второй треугольник из квадрата
        HashMap<String, Integer> mapTriangle3 = new HashMap();//третий треугольник из квадрата

        int x1 = squareX[0];
        int y1 = squareY[0];
        int x2 = squareX[1];
        int y2 = squareY[1];
        int x3 = squareX[2];
        int y3 = squareY[2];
        mapTriangle1.put("firstKatet", x3 - x1); //задаем первый катет
        mapTriangle1.put("secondKatet", y2 - y1);//задаем второй катет

        mapTriangle2.put("firstKatet", y3 - y2); //задаем первый катет
        mapTriangle2.put("secondKatet", x3- x2);//задаем второй катет

        mapTriangle3.put("firstKatet", x2 - x1); //задаем первый катет
        mapTriangle3.put("secondKatet", y3 - y1);//задаем второй катет

        //вычисляем стороны труегольников
        double triangleSide1 = getHypotenuse(mapTriangle1); // вычисляем первую гипотенузу по катетам
        double triangleSide2 = getHypotenuse(mapTriangle2); //второй вторую гипотенузу по катетам
        double triangleSide3 = getHypotenuse(mapTriangle3); //третий третью гипотенузу по катетам

        double[] finalTriangle = {triangleSide1, triangleSide2, triangleSide3};
        Arrays.sort(finalTriangle);
        double hypotenuse = Math.pow(finalTriangle[2], 2);
        double katet1 = Math.pow(finalTriangle[0], 2);
        double katet2 = Math.pow(finalTriangle[1], 2);


        if (hypotenuse == katet1 + katet2) {
            System.out.println("This is a SquareApex Triangle");
        }
    }

    private static double getHypotenuse(HashMap<String, Integer> mapTriangle1) {

        int a = mapTriangle1.get("firstKatet");
        int b = mapTriangle1.get("secondKatet");
        double hypotenuse = Math.pow(a, 2) + Math.pow(b, 2);

        return Math.sqrt(hypotenuse); //возвращаем корень гипотеузы
    }
}
