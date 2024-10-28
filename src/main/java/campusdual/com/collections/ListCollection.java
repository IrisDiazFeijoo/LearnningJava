package campusdual.com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {

        List<String> instruments = new ArrayList<>();
        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Bass");

        for (int i = 0; i < instruments.size(); i++) { // Quitamos el punto y coma aquí
            System.out.println("Instrument at index " + i + ": " + instruments.get(i));
        }

        instruments.remove("Piano");

        for( String item :instruments){// estoy recorriendo la lista sin tener en cuenta el índice
            System.out.println(item);

        }

    }
}
