package recursividad;

public class BuscarArreglo {

    public static int buscaIterativo(int [] numeros,int buscado){
        for(int i=0;i<numeros.length;i++){
            if(numeros[i] == buscado){
                return i;
            }
        }
        return -1;
    }
public static int buscaRecursivo(int [] numeros, int buscado){
        return buscaRecursivo(numeros, buscado, 0);
}
    public static int buscaRecursivo(int [] numeros, int buscado, int i){
        if(i < numeros.length) {
            if (numeros[i] == buscado) {
                return i;
            } else {
                return buscaRecursivo(numeros, buscado, i + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] numeros = {1,9,2,45,34,68,43,45,76,32,65,76,1232,87};
        long tincio, tfinal, ttotal;
        tincio = System.nanoTime();
        System.out.println("Metodo iterativo");
        System.out.println("Posicion: " + buscaIterativo(numeros, 45));
        tfinal = System.nanoTime();
        ttotal = tfinal - tincio;
        System.out.println(ttotal);

        tincio = System.nanoTime();
        System.out.println("Metodo recursivo");
        System.out.println("Posicion: " + buscaRecursivo(numeros, 45));
        tfinal = System.nanoTime();
        ttotal = tfinal - tincio;
        System.out.println(ttotal);

    }
}
