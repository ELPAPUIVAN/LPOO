
package ejercicio;
import java.util.Scanner;

public class ejercicio4 {
        public static void main(String[] args){
       Scanner sc = new Scanner(System.in);


            System.out.println("Ingrese el primer valor: ");
            int nro1 = sc.nextInt();
            System.out.println("Ingrese que tipo de operacion desea realizar(+:suma,-:resta,multiplicacion:x,division:%): ");
            char signo =sc.next().charAt(0);
            System.out.println("Ingrese el segundo numero: ");
            int nro2 = sc.nextInt();
            
            switch (signo) {
                case '+':
                    nro1 = nro1+nro2;
                    System.out.println("Resultado: "+ nro1);
                    break;
                case '-':
                    nro1 = nro1-nro2;
                    System.out.println("Resultado: "+ nro1);
                    break;
                case 'x':
                    nro1 = nro1*nro2;
                    System.out.println("Resultado: "+ nro1);
                    break;
                case '%':
                    nro1 = nro1/nro2;
                    System.out.println("Resultado: "+ nro1);
                    break;
                default:
                    System.out.println("operador invalido");
                    break;
            }
                    
        }
        
}
