package recursividad;

public class StringReves {

    public static String revesRecursivo(String palabra){
        String nuevo = "";
        return revesRecursivo(palabra,palabra.length()-1);
    }
 private static String revesRecursivo(String palabra, int i){
        if(i >= 0 )
        return palabra.charAt(i) + revesRecursivo(palabra, i -1);
        else
            return "";
 }

    public static String revesIterativo(String palabra) {
        String nuevo = "";
        for (int i = palabra.length()-1; i >= 0; i--) {
            nuevo = nuevo + palabra.charAt(i);
        }
        return nuevo;
    }


    public static void main(String[] args) {
        String palabra = "Alex";
        revesIterativo(palabra);
        System.out.println("iterativo "+revesIterativo(palabra));
        System.out.println("recursivo " + revesRecursivo(palabra));
    }


}
