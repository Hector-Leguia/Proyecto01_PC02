package Programas;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declarar un arreglo para almacenar los nombres de 5 personas
        String[] personas = new String[5];
        // Ingresar los nombres en el arreglo
        System.out.println("Ingrese los nombres de 5 personas:");
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            personas[i] = scanner.nextLine();
        }
        // Solicitar al usuario que ingrese el nombre a buscar
        System.out.print("\nIngrese el nombre que desea buscar: ");
        String nombreBuscado = scanner.nextLine();
        // Inicializar una variable para almacenar si el nombre fue encontrado
        boolean encontrado = false;
        int posicion = -1;
        // Buscar el nombre en el arreglo
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }
        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("\nMensaje: \"Si existe " + nombreBuscado + "\" en la posicion " + (posicion + 1) + ".");
        } else {
            System.out.println("\nMensaje: \"" + nombreBuscado + " no existe en el arreglo.\"");
        }
    }
}