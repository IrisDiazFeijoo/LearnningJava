package campusdual.com.Input;

import com.campusdual.Utils;

import java.util.Scanner;

public class Input {

    public static void  useScannerToGetName (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your name: ");
        String name = scanner.nextLine();
        System.out.println("HI " + name);
    }

    public static void  useUtilsToGetName (){
        int name = Utils.integer("Write your name: ");
        System.out.println("HI " + name);
    }

    public static void main (String [] args) {
        //useScannerToGetName();
        useUtilsToGetName();

    }
}
