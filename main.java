import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    // Crear objeto Scanner para leer desde teclado
    Scanner sc = new Scanner(System.in);

    // Leer dos números enteros desde teclado
    System.out.println("Ingrese el suedo del empleado");
    int num1 = sc.nextInt();

    // Calcular el porcentaje de descuento si num1 es mayor que num2
    if ( num1 == 5000) {
      double descuento = num1 * 0.1;
      double resultado = num1+descuento;
      System.out.println("El aumento del empleado 1 es: " + resultado);
    }

    if ( num1 == 7000) {
        double descuento = num1 * 0.08;
        double resultado = num1+descuento;
        System.out.println("El aumento del empleado 2 es: " + resultado);
      }

      if ( num1 == 4000) {
        double descuento = num1 * 0.1;
        double resultado = num1+descuento;
        System.out.println("El aumento del empleado 3 es: " + resultado);
      }
    // Cerrar el objeto Scanner
    sc.close();
  }
}


