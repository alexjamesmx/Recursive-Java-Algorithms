package recursividad;

public class Pares {


    public static String sonPares( int [] numeros){
        String resultado = "";
        for(int i = 0;i < numeros.length; i++){
            if(numeros[i]%2 == 0){
                resultado = resultado + numeros[i] + ", ";
            }
        }
        return resultado;
    }


    private static String sonParesRecursivo( int [] numeros){
        return sonParesRecursivo(numeros, 0);
    }

    public static String sonParesRecursivo( int [] numeros, int i ){
        String resultado = "";
        if (i < numeros.length && numeros[i]%2 == 0)
            return numeros[i] + ", " + sonParesRecursivo(numeros, i+1) ;
        else if (i < numeros.length && numeros[i]%2 != 0)
            return sonParesRecursivo(numeros, i+1) ;
        else
            return "";
    }


    public static void main(String[] args) {
        int i = 0;
        int [] numeros = {1,9,2,45,34,68,43,45,76,32,65,76,1232,87};
        //System.out.println(sonPares(numeros));
        System.out.println(sonParesRecursivo(numeros));




    }



}
