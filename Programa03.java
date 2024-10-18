
package Programas;
import java.util.Scanner;
public class Programa03 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declarar un arreglo para almacenar las compras de los 12 meses
        double[] compras = new double[12];
        double totalCompras = 0;
        double compraMenor = Double.MAX_VALUE;
        int mesMenorCompra = 0;
        // Ingresar las compras de los 12 meses
        for (int i = 0; i < compras.length; i++) {
            System.out.print("Ingrese la compra del mes " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            totalCompras += compras[i];
            // Determinar la compra menor y su mes correspondiente
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
                mesMenorCompra = i + 1; // Guardamos el mes (i + 1 para que el mes sea 1-based)
            }
        }
        // Calcular el promedio de compras
        double promedioCompras = totalCompras / 12;

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Total de compras: " + totalCompras);
        System.out.printf("Promedio de compras: %.2f\n", promedioCompras);
        System.out.println("La compra menor fue de: " + compraMenor + " en el mes " + mesMenorCompra);
    }
}