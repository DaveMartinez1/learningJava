import java.util.Scanner;

public class VectoresDinamicos{
    public static void main(String[] args){
    
    int longitud = 0;
    Scanner userInput = new Scanner(System.in);
    
    System.out.print("¿Cuanntos numeros deseas ingresar?:");
    longitud = userInput.nextInt();
    
    int numeros[] = new int[longitud];
    
    for (int i = 0; i<numeros.length; i++){
        System.out.println("Dame el valor #" + (i+1));
        numeros[i] = userInput.nextInt();
    }
    for (int i = 0; i<numeros.length; i++){
        System.out.print("[" + numeros[i] + "]");
    }
    }
}