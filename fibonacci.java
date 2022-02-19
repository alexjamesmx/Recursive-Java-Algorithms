package recursividad;

public class fibonacci {
    public static void main(String[] args) {
        for(int i =0; i < 20; i ++){
            System.out.println(fibonacci(i) + "");
        }
    }

    public static long fibonacci(long numero){
        if(numero==0){
            return 0;
        }
        else if(numero == 1){
            return 1;
        }
        else
            return fibonacci(numero-1) + fibonacci (numero-2);
    }


}
