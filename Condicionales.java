public class Condicionales{
  public static void main(String args[]){
   int matematicas = 5;
   int biologia = 7;
   int quimica = 9;
   float promedio;
   
   promedio = (matematicas+biologia+quimica) / 3;

   if (promedio >= 6){
     System.out.println("Tu promedio es: " + promedio + " Aprobaste!");
   
   } else{
    System.out.println("Tu promedio es: " + promedio + " Reprobaste!");
   }
 }
}
