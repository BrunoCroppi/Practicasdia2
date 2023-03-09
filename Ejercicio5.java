package practicas;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por
 * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
 * investigar la función Math.sqrt().
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero1 = leer.nextInt();
        System.out.println("El doble del numero ingresado es: "+numero1*2);
        System.out.println("El triple del numero ingresado es: "+numero1*3);
        if (numero1<0) {
            System.out.println("No se puede calcular raiz cuadrada de numero negativo");
        
        }else {
            System.out.println("La raiz cuadrada del numero ingresado es: "+String.format("%.2f",Math.sqrt(numero1)));
        }
        leer.close();
    }

} 
