public class EjercicioBucles{
  public static void main(String args[]){

   /* Hacer un codigo que arroje los siguientes outputs usando
      FOR, WHILE y DO WHILE:
   
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     * 1, 99, 2, 98, 3, 97, 4, 96, 5, 95
   */

   // Primero:
   System.out.println("Primera serie");
   for (int i = 1; i <= 10; i++){
     if (i<10){
       System.out.print(i+", ");
     } else {
       System.out.print(i+"\n");
     }
   }
   
   System.out.println("Segunda serie");

   int iA = 1;
   int iB = 99;

   while (iA <= 5 && iB >= 95){
     if (iB > 95){
       System.out.print(iA + ", " + iB + ", ");
     } else {
       System.out.println(iA + ", " + iB + "\n");
     }

     iA++;
     iB--;
   }
 }
}
