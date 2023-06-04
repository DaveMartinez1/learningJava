public class Operaciones{
  public static void main(String args[]){
   
   int numUno = 4;
   int numDos = 4;
   int resultado;
	
// Se espera un 4 como resultado

   resultado = numUno + numDos / 2;
   System.out.println("Resultado incorrecto: " + resultado);

   resultado = (numUno + numDos) / 2;
   System.out.println("Resultado correcto: " + resultado);
 }
}
