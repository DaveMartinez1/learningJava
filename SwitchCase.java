import java.util.Scanner;

public class SwitchCase{
  public static void main(String args[]){

   int numUno = 0, numDos = 0, resultado = 0;
   int parametro = 0;
   Scanner input = new Scanner(System.in);

   System.out.print("\nIngresa el primer valor: ");
   numUno = input.nextInt();

   System.out.print("\nIngresa el segundo valor: ");
   numDos = input.nextInt();

   System.out.println("\tEscoge una opcion:");

   System.out.print("\n1) Suma\n2) Resta\n3) Multiplicación\n4) División\n: ");
   parametro = input.nextInt();

   switch(parametro){

    case 1: resultado = numUno + numDos;
	    System.out.println("El resultado de la suma es: " + resultado); 
	    break;
    case 2: resultado = numUno - numDos;
            System.out.println("El resultado de la resta es: " + resultado);
            break;
    case 3: resultado = numUno * numDos;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
            break;
    case 4: resultado = numUno / numDos;
            System.out.println("El resultado de la division es: " + resultado);
            break;
    default: System.out.println("Error! Opcion invalida");
   }

 }
}
