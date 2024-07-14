/**
 * Ejercicio 1:
 * Dados los lados de un triangulo crear una aplicacion de consola que determine si el triangulo es equilatero,
 * isoceles o escaleno e imprima el resultado en consola.
 */

/**
 * Dada la nota numerica de un estudiante determinar su nota literal e imprimirla en consola considerando los
 * siguientes rangos:
 * A: 90 o mas
 * B: entre 80 y 89
 * C: entre 70 y 79
 * D: entre 60 y 69
 * F: 59 o menos
 */

package classes;
import java.util.Scanner;

public class OperadorTerniario {
  public static void main(){
    System.out.println("Operadores Terniarios");

    Scanner scanner = new Scanner(System.in);
    // Ingresar el tamaño de los lados del triángulo
    System.out.print("Ingrese el tamaño del lado 1: ");
    double lado1 = scanner.nextDouble();

    System.out.print("Ingrese el tamaño del lado 2: ");
    double lado2 = scanner.nextDouble();

    System.out.print("Ingrese el tamaño del lado 3: ");
    double lado3 = scanner.nextDouble();

    ladosTriangulos(lado1, lado2, lado3);

    System.out.print("Ingrese la nota del estudiante: ");
    int nota = scanner.nextInt();

    notaEstudiante(nota);
    scanner.close();
  }

  //Primer item
  public static void ladosTriangulos(double lado1, double lado2, double lado3) {
    //Saber el tipo de triángulo usando operadores ternarios
    String tipoTriangulo = (lado1 == lado2 && lado2 == lado3) ? "Equilátero" :
            (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) ? "Isósceles" :
                    "Escaleno";

    // Imprimir el resultado
    System.out.println("El triángulo es: " + tipoTriangulo);
  }

  //Segundo Item
  public static void notaEstudiante(int nota) {
    //Saber la nota literal usando operadores ternarios
    String notaLiteral = (nota >= 90) ? "A" :
            (nota >= 80) ? "B" :
                    (nota >= 70) ? "C" :
                            (nota >= 60) ? "D" :
                                    "F";

    // Imprimir el resultado
    System.out.println("La nota literal del estudiante es: " + notaLiteral);
  }
}
