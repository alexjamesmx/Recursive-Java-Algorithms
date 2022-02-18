package recursividad;

public class Menores_cien {

    public static void main(String [] args){
        System.out.println("sin recursividad");
        mostrarSinRecursividad();
        System.out.println("\ncon recursividad");
        mostrarConRecursividad(0);
    }

    public static void mostrarSinRecursividad(){
        for(int i = 0; i<100; i = i + 2){
            System.out.print(i + ", ");
        }
    }
    public static void mostrarConRecursividad(int numero){ //numero limite llamado stack
        if(numero < 100) {
            System.out.print(numero + ", ");
            mostrarConRecursividad(numero + 2);
        }
        else
            System.out.print(numero + ", ");
    }
}
