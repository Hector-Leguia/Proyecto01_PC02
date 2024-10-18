package Programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cantidad
        System.out.print("Ingrese una cantidad (numero entero): ");
        int cantidad = scanner.nextInt();

        // Inicializar variables
        int digitoMayor = 0;
        int digitoActual;

        // Usar un ciclo while para encontrar el dígito mayor
        while (cantidad > 0) {
            digitoActual = cantidad % 10;  // Obtener el último dígito
            if (digitoActual > digitoMayor) {
                digitoMayor = digitoActual;  // Actualizar si el dígito actual es mayor
            }
            cantidad = cantidad / 10;  // Eliminar el último dígito
        }

        // Mostrar el dígito mayor
        System.out.println("El digito mayor es: " + digitoMayor);
    }
}