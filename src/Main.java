import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,CarData> carHashMap = new HashMap<>();
        carHashMap.put(new Car(1,"AA063A"),new CarData("2019","AMG GT 63s",15000000,"Black."));
        for (Map.Entry<Car,CarData> entry : carHashMap.entrySet()) {
            Car key = entry.getKey();
            CarData value = entry.getValue();
            System.out.println("Ключ: " + key + ", Значение: " + value);
        }
    }
}