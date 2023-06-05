import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[] args) {
        /* En el tercer ejercicio vamos a realizar un programa que calcule el sueldo de un trabajador,
        el programa va a solicitar el numero de horas que has trabajado en un mes, las horas se pagan a 10€. */

        // Variables
        int sueldoHora = 10, horasTrabajadas = 0, sueldoFinal = 0;
        String nombre = "";
        Scanner userInput = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = userInput.nextLine();

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = userInput.nextInt();

        sueldoFinal = horasTrabajadas*sueldoHora;

        System.out.println(nombre+"! Su sueldo final es de: "+sueldoFinal+" euros.");
    }
}