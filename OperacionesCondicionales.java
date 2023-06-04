public class OperacionesCondicionales{
  public static void main(String args[]){
   int operacion = 1;
   int numUno = 8;
   int numDos = 8;
   int resultado;

   if (operacion == 1){
     resultado = numUno + numDos;
     System.out.println("El resultado de la suma es: " + resultado);
   } else if (operacion == 2){
     resultado = numUno - numDos;
     System.out.println("El resultado de la resta es: " + resultado);
   } else if (operacion == 3){
     resultado = numUno * numDos;
     System.out.println("El resultado de la multiplicacion es: " + resultado);
   } else if (operacion == 4){
     resultado = numUno / numDos;
     System.out.println("El resultado de la division es: " + resultado);
   } else{
     System.out.println("La opción que elegiste es inválida"); 
   }
 }
}
