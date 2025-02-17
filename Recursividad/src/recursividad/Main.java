package recursividad;

public class Main {


    /*static void recorrerArray(int [] n){
       for (int i = 0;i<n.length;i++){
           System.out.println(n[i]);
       }
   }*/


    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        metodoRecursivo(num, 0);

    }


    static void metodoRecursivo(int[] n, int indice) {
        //Caso base
        if (indice == (n.length - 1)) {
            System.out.println(n[indice]);
        } else {//Caso recursivo
            System.out.println(n[indice]);
            metodoRecursivo(n, indice + 1);
        }
    }

}
