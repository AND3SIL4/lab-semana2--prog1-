/*
* Ejercicio 1:
* Dadas las notas de 7 estudiantes: 40, 58, 72, 95, 66, 32, 87 determinar el promedio de nota de la clase e indicar en
* cada caso si es verdadero o falso que el estudiante tiene una nota por encima del promedio. Imprimir estos resultados
* en consola
* */

/*
* Una empresa X ha generado 340000$ en ingresos en el año por la venta de 10000 de sus productos, sin embargo, ha
* generado gastos de 18000$ al mes en publicidad y el costo de fabricacion de cada producto es de 12$. Obtener las
* ganancias y los gastos de la empresa y determinar si es verdadero o falso que la empresa ha generado perdidas en el
* año. Imprimir los resultados en consola
* */
package classes;

public class OperadoresRacionales {
    public static void main(){
        System.out.println("Operadores Relacionales");
        notasEstudiantes();
        calculoEmpresa();
    }
    //Primer item
    public static void notasEstudiantes() {
        final int[] notaEstudiantes = {40, 58, 72, 95, 66, 32, 87};

        //Get the average
        int counter = 0;
        for (int notaEstudiante : notaEstudiantes){
            counter += notaEstudiante;
        }
        int promedio = counter / notaEstudiantes.length;

        //Imprimir el resultado
        System.out.println("El promedio es: " + promedio);

        //To know if the score is less than the total average
        for (int notaEstudiante : notaEstudiantes){
            if (notaEstudiante < promedio){
                System.out.println("La nota " + notaEstudiante + " es MENOR que el promedio " + promedio);
            } else {
                System.out.println("La nota " + notaEstudiante + " es MAYOR que el promedio " + promedio);
            }
        }
    }

    //Segundo Item
    public static void calculoEmpresa(){
        // Datos iniciales
        double ingresosAnuales = 340000; // Ingresos en dólares
        int cantidadProductos = 10000; // Cantidad de productos vendidos
        double gastoMensualPublicidad = 18000; // Gastos mensuales en publicidad
        double costoFabricacionPorProducto = 12; // Costo de fabricación por producto

        // Cálculos
        double gastosAnualesPublicidad = gastoMensualPublicidad * 12; // Gastos anuales en publicidad
        double costoTotalFabricacion = costoFabricacionPorProducto * cantidadProductos; // Costo total de fabricación
        double gastosTotales = gastosAnualesPublicidad + costoTotalFabricacion; // Gastos totales

        double ganancias = ingresosAnuales - gastosTotales; // Ganancias

        // Imprimir resultados
        System.out.println("Ingresos anuales: $" + ingresosAnuales);
        System.out.println("Gastos anuales en publicidad: $" + gastosAnualesPublicidad);
        System.out.println("Costo total de fabricación: $" + costoTotalFabricacion);
        System.out.println("Gastos totales: $" + gastosTotales);
        System.out.println("Ganancias: $" + ganancias);

        // Determinar si ha generado pérdidas
        boolean haGeneradoPerdidas = ganancias < 0;
        System.out.println("¿La empresa ha generado pérdidas? " + (haGeneradoPerdidas ? "Verdadero" : "Falso"));
    }
}
