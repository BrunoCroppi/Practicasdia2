package practicas;
import java.util.Scanner;
/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        System.out.println("En minuscula: "+frase.toLowerCase());
        System.out.println("En mayuscula: "+frase.toUpperCase());
        leer.close();
    }

}
