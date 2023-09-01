import java.lang.reflect.Array;

public class FirmaDigital{

    /*
     * codigo para ver como se comporta el hash  
     */
    public static void main(String[] args) {
        String[] list1 = { "a", "b", "c"};                  
        String[] list2 = { "aa", "bb", "cc"};

       
         System.out.println("Firma digital de la lista 1: " + list1.hashCode()); 
         System.out.println("Firma digital de la lista 2: " + list2.hashCode());




    }
}