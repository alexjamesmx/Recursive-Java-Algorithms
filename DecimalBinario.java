package recursividad;

public class DecimalBinario {


    public static String decimalBinarioRecursivo(int numero){
        if(numero > 0) {
            return decimalBinarioRecursivo(numero/2) + numero % 2;
        }
        return "";
    }



    public static String decimalBinraioIterativo(int numero){
        String resultado= "";
        int cociente, residuo;
        while ( numero > 0 ){
            cociente = numero / 2;
            residuo = numero % 2;
            resultado = residuo + resultado;
            numero = cociente;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 4;
        System.out.println("El binario de " + numero + ": "+ decimalBinraioIterativo(numero) + " Metodo iterativo");
        System.out.println("El binario de " + numero + ": "+ decimalBinarioRecursivo(numero) + " Metodo recursivo");
    }
}
