package recursividad;

public class MaximoComunDIvisor {


    public static int mcdIterativo(int numero1, int numero2){
        while ( numero1 != numero2 ){
            if(numero1 > numero2){
                numero1 = numero1 - numero2;
                System.out.println("numero1: "+numero1);
            }
            else
                numero2 = numero2 - numero1;
            System.out.println("numero2: "+numero2);
        }
        return numero2;
    }


    public static int mcdRecursivo(int numero1, int numero2 ){
        if(numero1 > numero2)
            return mcdRecursivo(numero1-numero2,numero2);
        else if(numero1 < numero2)
        return mcdRecursivo(numero1,numero2-numero1);
        else
        return numero1;
    }



    public static void main(String[] args) {

        //System.out.println(mcdIterativo(27,15));
        System.out.println(mcdRecursivo(27,15));


    }


}
