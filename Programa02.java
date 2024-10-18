package Programas;
import java.util.Scanner;
public class Programa02 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vendedorMenorVenta = "";
        int menorVentaTotal = Integer.MAX_VALUE; // Inicializamos con un valor grande para comparar
        String continuar;
        do {
            System.out.print("Ingrese el nombre del vendedor: ");
            String nombreVendedor = scanner.next();

            System.out.print("Ingrese la primera venta: ");
            int venta1 = scanner.nextInt();
            System.out.print("Ingrese la segunda venta: ");
            int venta2 = scanner.nextInt();
            System.out.print("Ingrese la tercera venta: ");
            int venta3 = scanner.nextInt();
            // Calcular el total de ventas
            int totalVentas = venta1 + venta2 + venta3;
            // Mostrar el total de ventas del vendedor actual
            System.out.println("Total de ventas del vendedor " + nombreVendedor + ": " + totalVentas);
            // Determinar si es el menor total de ventas
            if (totalVentas < menorVentaTotal) {
                menorVentaTotal = totalVentas;
                vendedorMenorVenta = nombreVendedor;
            }
            // Preguntar si desea continuar registrando datos
            System.out.print("¿Desea continuar registrando datos? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));
        // Mostrar el resultado del vendedor con el menor total de ventas
        System.out.println("\nResultados:");
        System.out.println("Vendedor con menor total de ventas: " + vendedorMenorVenta);
        System.out.println("Total de ventas: " + menorVentaTotal);
    }
}