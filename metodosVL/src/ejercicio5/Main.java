package ejercicio5;

public class Main {

    public static String decimalBinario(int numeroDecimal){
        String binario= "";
        int resto;

        if(numeroDecimal == 0){
            binario = "0";
        }else{
            //Mientras que el numero decimal sea mayor que 0
            while(numeroDecimal>0){
                resto = numeroDecimal % 2; //Obtiene el resto dividiendo por 2 (0/1)
                binario = resto + binario; //Agrega el resto al inicio de la cadena binario
                numeroDecimal = numeroDecimal / 2; //Divide el número entre 2 (parte entero)
            }
        }

        return binario;
    }

    static int binarioDecimal(String numeroBinario){
        //1010011
        int decimal = 0;
        char digito;
        int multiplicador = 1;//Representa las potencias de 2 (1,2,4,8,....)

        for(int i = numeroBinario.length()-1;i>=0;i--){ //1º -> i = 6 , 2º -> i = 5..... 0
            digito = numeroBinario.charAt(i);

            //Si el digito es 1
            if(digito == '1'){
                decimal = decimal + multiplicador; //decimal+=multiplicador
            }

            //Actualizar el multiplicado (potencia de 2)
            multiplicador = multiplicador * 2; //multiplicado*=2

        }


        return decimal;
    }


    public static void main(String[] args) {
        //Mañana 22/01/2025, lo corregimos:
        //Método que convierta un número decimal a binario
        //Método que convierta un número binario a decimal

        System.out.println(decimalBinario(450));

        System.out.println(binarioDecimal("1010011"));
        //.split("")

    }
}
