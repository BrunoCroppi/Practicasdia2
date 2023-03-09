package practicas;
import java.util.Scanner;
/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float centigrados,farenheit;
        System.out.println("Ingrese los grados centigrados en numeros");
        centigrados = leer.nextFloat();
        farenheit = 32+(9 * centigrados / 5);
        System.out.println("Su equivalente en grados farenheit es:"+farenheit);
        leer.close();
    }

}
