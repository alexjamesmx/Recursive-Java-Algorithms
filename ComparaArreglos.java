package recursividad;

public class ComparaArreglos {

    public static boolean comparaIterativo(int [] arreglo1,int [] arreglo2){
        if(arreglo1.length == arreglo2.length){
            for(int i = 0; i< arreglo1.length; i++){
                if(arreglo1[i] != arreglo2[i]){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }


    public static boolean comparaRecursivo(int [] arreglo1, int [] arreglo2){
        if(arreglo1.length == arreglo2.length)
            return comparaRecursivo(arreglo1, arreglo2, 0);
        else
            return false;
    }
    private static boolean comparaRecursivo(int [] arreglo1, int []arreglo2, int i){
        if(i < arreglo1.length) {
            if(arreglo1[i] == arreglo2[i])
            return comparaRecursivo(arreglo1, arreglo2, i + 1);
            else
                return false;
        }
        else return true;
    }



    public static void main(String[] args) {
        int [] arreglo1 = {1,4,4,47};
        int [] arrelglo2 = {1,4,4,47};
        // System.out.println(comparaIterativo(arreglo1, arrelglo2));

        System.out.println(comparaRecursivo(arreglo1,arrelglo2));
    }
}
