
import java.util.Arrays;
import java.util.Map;


public class Square {
    public static void createSquare(Map mapTriangle) {
        int[] squareX = {(int) mapTriangle.get("getApexX1"), (int) mapTriangle.get("getApexX2"), (int) mapTriangle.get("getApexX3")};
        int[] squareY = {(int) mapTriangle.get("getApexY1"), (int) mapTriangle.get("getApexY2"), (int) mapTriangle.get("getApexY3")};
        Arrays.sort(squareX);
        Arrays.sort(squareY);
        Calculate.createTrianglesFromSquare(squareX, squareY); //отсылаем отсортированные координаты треугольника
    }
}
