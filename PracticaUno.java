import java.util.Scanner;

public class PracticaUno{
  public static void main(String args[]){

   int antiguedad = 0, departamento = 0;
   String nombre = "";
   Scanner keyInput = new Scanner(System.in);
   Scanner nameInput = new Scanner(System.in);
   Scanner serviceInput = new Scanner(System.in);
   
   System.out.print("\tBienvenido al sistema vocacional de Coca-Cola Company\n");

   System.out.print("\nIngrese el nombre del trabajador: ");
   nombre = nameInput.nextLine();
   
   System.out.print("\nIngrese la clave de su departamento: ");
   departamento = keyInput.nextInt();

   System.out.print("\nCuantos años de servicio tiene el trabajador?: ");
   antiguedad = serviceInput.nextInt();

   if (departamento == 1 && antiguedad == 1){
     System.out.println("\n" + nombre + " tiene derecho a 6 dias de vacaciones!");
   } else if (departamento == 1 && antiguedad >= 2 && antiguedad <= 6){
     System.out.println("\n" + nombre + " tiene derecho a 14 dias de vacaciones!");
   } else if (departamento == 1 && antiguedad >= 7){
     System.out.println("\n" + nombre + " tiene derecho a 20 dias de vacaciones!");
   }

   if (departamento == 2 && antiguedad == 1){
     System.out.println("\n" + nombre + " tiene derecho a 7 dias de vacaciones!");
   } else if (departamento == 2 && antiguedad >= 2 && antiguedad <= 6){
     System.out.println("\n" + nombre + " tiene derecho a 15 dias de vacaciones!");
   } else if (departamento == 2 && antiguedad >= 7){
     System.out.println("\n" + nombre + " tiene derecho a 22 dias de vacaciones!");
   }   
   
   if (departamento == 3 && antiguedad == 1){
     System.out.println("\n" + nombre + " tiene derecho a 10 dias de vacaciones!");
   } else if (departamento == 3 && antiguedad >= 2 && antiguedad <= 6){
     System.out.println("\n" + nombre + " tiene derecho a 20 dias de vacaciones!");
   } else if (departamento == 3 && antiguedad >= 7){
     System.out.println("\n" + nombre + " tiene derecho a 30 dias de vacaciones!");
   }

 }
}
