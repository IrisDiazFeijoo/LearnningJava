package campusdual.com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> instruments = new HashSet<>();
        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Bass");
        instruments.add("Drums");
        instruments.add("Piano");
        instruments.add("Drums"); //no permite elementos duplicados, por mucho que añada lo que me va a salir por pantalla no van a ser duplicados.

        System.out.println("Set of musical instruments:");
        for(String instrument: instruments){
            System.out.println(instrument);
        }
        instruments.remove("Drums");
        instruments.add("Flute");
        System.out.println("Set of musical instruments:"); // no sigue el orden de insercción, simplemente me enseña los elementos
        for(String instrument: instruments){
            System.out.println(instrument);
        }

    }
}
