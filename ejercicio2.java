
package ejercicio;

public class Ejercicio2 {

    public static void main(String[] args) {
        boolean esPrimo;
        for (int i = 50; i <= 100; i++) {
            esPrimo = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    esPrimo = false;
                    System.out.println(i + " es divisible por " + j);
                }        
                        
            }
            if (esPrimo)
                System.out.println(i + " es un numero primo");
                
        }
            
    }
    
}
