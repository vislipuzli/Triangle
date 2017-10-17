import java.util.HashMap;

public class Hypotenuse {
    static double getHypotenuse(HashMap<String, Integer> mapTriangle1) {

        int a = mapTriangle1.get("firstKatet");
        int b = mapTriangle1.get("secondKatet");
        double hypotenuse = Math.pow(a, 2) + Math.pow(b, 2);

        return Math.sqrt(hypotenuse); //возвращаем корень гипотеузы
    }
}
