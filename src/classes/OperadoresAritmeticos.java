/*
 * Ejercicio 1:
 * Una universidad tiene un presupuesto de 64738$ para la inversion anual de la institucion. Estos recursos deben
 * dividirse de manera equitativa entre las areas de: investigaciones, deportes y equipamiento, sin tomar en cuenta
 * centavos. Obtener el monto de inversion que se debe presupuestar para cada area y el monto sobrante (si existiera).
 * Una vez obtenidos los presupuestos y el sobrante convertir estos montos a tu moneda local e imprimir los resultados
 * en consola.
 * */

/*
 * Ejercicio 2:
 * Un auto recorre la ruta entre Barcelona y Madrid en 8 horas, considerando que el automovil mantuvo una velocidad
 * constante durante todo el trayecto, obtener la velocidad en metros por minuto a la que viajo el automovil e
 * imprimirla en consola.
 * */

package classes;

public class OperadoresAritmeticos {
  //Main method to run the steps
  public static void main(){
    System.out.println("Operadores Artimeticos");
    presupuestoUniversidad();
  }

  public static void presupuestoUniversidad(){
    //Declarate the constant and initial variables
    final int totalPresupuesto = 64738;
    final String[] areas = {"investigaciones", "deportes", "equipamiento"};
    final int totalAreas = areas.length;

    //Get to investiment amount per area
    int montoPorArea = totalPresupuesto / totalAreas;
    int montoRestante = totalPresupuesto % totalAreas;

    //Results to local money (Colombian pesos)
    double resultMontoPerArea = calculateColombianPesos(montoPorArea);
    double resultMontoRestante = calculateColombianPesos(montoRestante);

    //Show info and results
    System.out.println("El monto de inversion para cada area es: " + montoPorArea);
    //Validate if the rest amount exits or not
    if (montoRestante > 0){
      System.out.println("El monto sobrante de inversion es: " + montoRestante);
    }
    //Convert to local money
    System.out.println("El monto de inversion para cada area en pesos colombianos es: " + resultMontoPerArea + " COP");
    System.out.println("El monto de inversion restante en pesos colombianos es: " + resultMontoRestante + " COP");
  }

  public static double calculateColombianPesos(double amount){
    double tasaCambio = 3927;
    return amount * tasaCambio;
  }
}
