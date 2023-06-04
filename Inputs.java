import java.util.Scanner;

public class Inputs{
  public static void main(String args[]){
   
   Scanner userInput = new Scanner(System.in);
   String nombre = "";
   int numUno, numDos, resultado;

   System.out.println("Ingresa tu nombre");
   nombre = userInput.nextLine();

   System.out.println("Ingresa el primer valor para la suma: ");
   numUno = userInput.nextInt();

   System.out.println("Ingresa el segundo valor para la suma: ");
   numDos = userInput.nextInt();
   
   resultado = numUno + numDos;
   System.out.println("Hola, " + nombre + "! El resultado de la suma es: " + resultado);
 }
}
