package recursividad;

public class SumaArreglo {


    public static int sumaIterativo(int [] numeros){
    int suma = 0;
        for( int i = 0; i < numeros.length; i++ ){
        suma = numeros[i] + suma;
    }
        return suma;
    }
    public static int sumaRecursivo(int [] numeros){
        return sumaRecursivo(numeros, 0);
    }

    private static int sumaRecursivo(int [] numeros,int i){
        if(i < numeros.length)
            return sumaRecursivo(numeros, i + 1) + numeros[i];
        else
            return 0;
    }

    public static void main(String[] args) {
        int [] numeros = {1,4,6,45,34,68,43,45,76,32,65,76,1232,87};
        //System.out.println(sumaIterativo(numeros));
        System.out.println(sumaRecursivo(numeros));

    }

}
