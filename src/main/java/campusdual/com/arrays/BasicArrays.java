package campusdual.com.arrays;

public class BasicArrays {
    public static void main(String[] args) {
        int [] firsinttArray = new int[3];//Declaración tipo de un array. Un array tiene una longitud determinada.
        firsinttArray[0] = 15;
        firsinttArray[1]= 17;
        firsinttArray[2]= 19;
        //así queda inicializado el array. Tiene valores en cada posición.

        String[] firstStringArray = {"A","B","C","D"};// Define direcatamente no indica la memoria que voy a poner.

        System.out.println("First int array lenght: " + firsinttArray.length);//Nos permite ver el tamaño del array.
        System.out.println("First String array lenght: " + firstStringArray.length);

        System.out.println("First int array position value: " + firsinttArray[0]);//Nos permite ver valor de un índice (posición).
        System.out.println("First String array position value: " + firstStringArray[0]);

        System.out.println("Last int array position value: " + firsinttArray[firsinttArray.length-1]);//Nos permite ver valor de la última posición (índice). Menos uno porque los índeces empiezan en 0, como length te da la cantidad de elementos 3(elementos) - 1 = 2, que sería el valor del índice 2.
        System.out.println("Last String array position value: " + firstStringArray[firstStringArray.length-1]);

        //con un bucle for podemos recorrer un array.

        System.out.println("Loop through first int array");//menor que la longitud del array porque los índices empiezan en 0 y length me da la cantidad todal de elementos que en este caso sería 3 e índices (0,1 y 2)
        for (int i = 0; i < firsinttArray.length; i++) {
            System.out.print(firsinttArray[i] + " ");
        }
        System.out.println();

        System.out.println("Loop through first int array");
        for (int i = 0; i < firstStringArray.length; i++) {
            System.out.print(firstStringArray[i] + " ");
        }
        System.out.println("\n");

        int maxi = 3;
        int maxj = 3;
        int value = 0;

        int[][] secondIntArray = new int[maxi][maxj]; // Para completar los valores hacemos un bucle for
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                value++;
                secondIntArray[i][j] = value; // el value nos permite tener un valor que voy a ir incrementando. Lo que hace el bucle es entrar en la fila (i) y ahora en la columna (j) e incrementa el valor de value, por tanto fila 0 y columna 0 el valor es 1 y así sucesivamente. Value es una variable que guarda el valor que quiero meter.

            }

        }

        for (int i = 0; i < maxi ; i++) {
            for (int j = 0; j < maxj; j++) {
                System.out.print(secondIntArray[i][j] + " "); // aquí lo imprimos sólo.

            }
            System.out.println();
        }

        String[][] secondStringArray = {{"A","B","C","D"}, {"E","F","G","H"},{"I","J","K","L"}};
        for (int i = 0; i < secondStringArray.length ; i++) {
            for (int j = 0; j < secondStringArray.length; j++) {
                System.out.print(secondIntArray[i][j] + " "); // aquí lo imprimos sólo.

            }
            System.out.println();

        }

    }

}
