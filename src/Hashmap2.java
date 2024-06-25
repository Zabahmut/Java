import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 1; i <= 50; i++) {
            numbers.put(i, i * i);
        }

        for(Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }


    }

}

