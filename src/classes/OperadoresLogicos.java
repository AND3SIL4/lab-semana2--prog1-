/**
* Ejercicio 1:
* Dado el año de nacimiento de una persona y asumiendo que esta persona nacio en el mes de febrero determinar si es
* verdadero o falso que esta persona es actualmente adolescente e imprimir la respuesta en consola
*/

/**
 * Dado el tamano de todos los lados de una figura de 4 lados determinar si es verdadero o falso que la figura es un
 * rectangulo e imprimir la respuesta en consola.
 */
package classes;
import java.util.Calendar;
import java.util.Scanner;

public class OperadoresLogicos {
    public static void mai() {
        System.out.println("Operadores Logicos");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el año de nacimiento: ");
        int anoNacimiento = scanner.nextInt();
        anoNacimiento(anoNacimiento);

        //Ingresar el tamaño de los lados
        System.out.print("Ingrese el tamaño del lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el tamaño del lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el tamaño del lado 3: ");
        double lado3 = scanner.nextDouble();

        System.out.print("Ingrese el tamaño del lado 4: ");
        double lado4 = scanner.nextDouble();
        ladosFigura(lado1, lado2, lado3, lado4);

        scanner.close();
    }

    //Primer Item
    public static void anoNacimiento(int anoNacimiento){
        //Obtener el año actual
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);

        //Calcular la edad
        int edad = añoActual - anoNacimiento;

        //Verificar si la persona es adolescente
        boolean esAdolescente = (edad >= 13 && edad <= 19);

        //Imprimir el resultado
        System.out.println("¿La persona es actualmente adolescente? " + (esAdolescente ? "Verdadero" : "Falso"));
    }

    //Lados figura
    public static void ladosFigura(double lado1, double lado2, double lado3, double lado4) {

        //Verificar si es un rectángulo
        boolean esRectangulo = (lado1 == lado3 && lado2 == lado4);

        //Mostrar el resultado
        System.out.println("¿La figura es un rectángulo? " + (esRectangulo ? "Verdadero" : "Falso"));
    }
}
