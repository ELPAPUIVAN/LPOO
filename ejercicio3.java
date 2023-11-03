
package ejercicio;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean T;
        T=true;
        do {            
            
        System.out.println("ingrese un numerito");
        int nro = sc.nextInt();
            if (nro > 100 && (nro%2 != 0)) {
               T=false; 
               
            }
        } while (T==true);
    }

}
