//Ejercicio 1
/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Leer los tres valores
        System.out.print("Ingrese el valor para A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor para B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el valor para C: ");
        double C = scanner.nextDouble();

        // Verificar si todos los valores son distintos
        if (A == B || A == C || B == C) {
            System.out.println("Error: Los valores deben ser distintos.");
        } else {
            // Determinar el mayor y el menor
            double mayor = A;
            double menor = A;

            if (B > mayor) {
                mayor = B;
            }
            if (C > mayor) {
                mayor = C;
            }

            if (B < menor) {
                menor = B;
            }
            if (C < menor) {
                menor = C;
            }

            // Imprimir el mayor y el menor
            System.out.println("El valor mayor es: " + mayor);
            System.out.println("El valor menor es: " + menor);
        }

        scanner.close();
    }
}*/

//Ejercicio 2
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Leer la calificación numérica
        System.out.print("Ingrese su calificación (1 a 10): ");
        int calificacion = scanner.nextInt();

        // Determinar la categoría usando un switch
        switch (calificacion) {
            case 1:
            case 2:
                System.out.println("Su calificación es: F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificación es: D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificación es: C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificación es: A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");
                break;
        }

        scanner.close();
    }
}
