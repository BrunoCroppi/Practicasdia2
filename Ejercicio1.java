package practicas;
import java.util.Scanner;
/**
 *
 * @author cropp
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un valor para numero 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese un valor para numero 2");
        num2 = leer.nextInt();
        System.out.println("La suma de los dos numeros es: "+(num1+num2));
    }
    
}
