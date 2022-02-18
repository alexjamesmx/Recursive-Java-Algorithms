package recursividad;

public class Arreglos {


    public static String generaString(int [] numeros) {
        String resultado = "";
        for(int i = 0; i < numeros.length; i++){
            resultado = resultado + numeros[i] + ", ";
        }
        return resultado;
    }

    public static String recursivoString(int [] numeros){
        return recursivoString(numeros, 0);
    }

    private static String recursivoString(int [] numeros,int i){
        String resultado = "";
        if(i < numeros.length)
            return  numeros[i] + ", " + recursivoString(numeros, i + 1) ;
        else
        return "";
    }

    public static void main(String[] args) {
        int i = 0;
        int numeros [] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(generaString(numeros));
        System.out.print(recursivoString(numeros));



    }
}
