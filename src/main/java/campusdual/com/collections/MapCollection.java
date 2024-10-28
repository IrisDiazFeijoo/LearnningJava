package campusdual.com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> instrumentsType = new HashMap<>();

        instrumentsType.put("Guitar", "String");
        instrumentsType.put("Piano", "String");
        instrumentsType.put("Drums", "Percussion");
        instrumentsType.put("Violin", "String");

        System.out.println("Map of musical instruments and types");
        for (Map.Entry entry : instrumentsType.entrySet()) { //es un set porque las claves son únicas.
            System.out.println(entry.getKey() + " - " + entry.getValue());

        }
        instrumentsType.put("Piano", "String");
        System.out.println("Map after modification");
        for (Map.Entry entry : instrumentsType.entrySet()) { //es un set porque las claves son únicas.
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Contains specific key");
        System.out.println(instrumentsType.containsKey("Piano"));
    }

}
