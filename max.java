package recursividad;

public class max {

    public static int maxIterativo(int[] numeros) {
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    public static int maxRecursivo(int[] numeros) {
        return maxRecursivo(numeros, 1,numeros[0]);
    }

    public static int maxRecursivo(int[] numeros, int i,int maximo) {
        if (i < numeros.length) {
            if (numeros[i] > maximo)
                return maxRecursivo(numeros, i + 1,numeros[i]);
            else
                return maxRecursivo(numeros,i + 1, maximo);
        }
            return maximo;
    }




    public static void main(String[] args) {
        int [] numeros = {1,2,5,67,2345,1234,135,7,114};
        //System.out.println(maxIterativo(numeros));
        System.out.println(maxRecursivo(numeros));
    }


}
