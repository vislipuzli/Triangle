import java.util.HashMap;

public class Triangle {

    public static HashMap createTriangle(int getApexX1, int getApexY1, int getApexX2, int getApexY2, int getApexX3, int getApexY3) {
        HashMap<String, Integer> mapTriangle = new HashMap();
        mapTriangle.put("getApexX1", getApexX1);
        mapTriangle.put("getApexY1", getApexY1);
        mapTriangle.put("getApexX2", getApexX2);
        mapTriangle.put("getApexY2", getApexY2);
        mapTriangle.put("getApexX3", getApexX3);
        mapTriangle.put("getApexY3", getApexY3);

        return  mapTriangle;
    }
}
