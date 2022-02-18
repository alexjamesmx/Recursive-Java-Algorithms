package recursividad;

public class Factorial {

    public static void main(String [] args){
        int i = 1;
        long tiempoinicio, tiempofinal, tiempototal;
         tiempoinicio = System.nanoTime();
        factorialRecursividad2(5,i);
        tiempofinal= System.nanoTime();
        tiempototal = tiempofinal - tiempoinicio;
        System.out.println("Tiempo total mi metodo: "+tiempototal);

        tiempoinicio = System.nanoTime();
        System.out.println(factorialRecursividad(5));
        tiempofinal= System.nanoTime();
        tiempototal = tiempofinal - tiempoinicio;
        System.out.println("Tiempo total del metodo profe: "+tiempototal);
    }

    public static int factorialRecursividad(int numero){
        if(numero > 1 ){
            return factorialRecursividad(numero-1)*numero;
        }
        else
           return 1;
    }


    public static void factorialRecursividad2(int numero,int i){
        if(numero > 1 ){
            i = numero * i; //5*1 = 5, 5*4
        factorialRecursividad2( numero- 1, i);
        }
        else
            System.out.println(i);;
    }
}
