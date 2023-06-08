import java.util.Scanner;

public class MetodoEquals{
    public static void main(String[] args){
        String nombre = "", altNombre = "";
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Introduce un nombre: ");
        nombre = userInput.nextLine();
        
        System.out.print("\nIntroduce otro nombre: ");
        altNombre = userInput.nextLine();
                         
       if (nombre.equalsIgnoreCase(altNombre)){
           System.out.println("Los nombres son iguales.");
       } else{
           System.out.println("Los nombre son diferentes.");
       }
    }
}
