package campusdual.com.loops;

import com.campusdual.Utils;

public class Whileloop {

    public static   void    verifyNumbers(){
        int num = Utils.integer("write a number grater than 10 and lower than 20");
        while(num < 10 || num > 20){
            num = Utils.integer("Not a valid number, try again");
        }

        System.out.println("Number " + num + " is in range");

    }

    public static void main(String[] args) {
        verifyNumbers();

    }
}
