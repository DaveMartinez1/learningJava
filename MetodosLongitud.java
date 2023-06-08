import java.util.Scanner;

public class MetodosLongitud{
    public static void main(String[] args){
        String textoOriginal = "", textoSubstraccion = "";
        int numCaracteres = 0, desde = 0, hasta = 0;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena de caracteres: ");
        textoOriginal = userInput.nextLine();
        
        numCaracteres = textoOriginal.length();
        
        System.out.println("La cadena tiene de caracteres " + textoOriginal + " tiene " + numCaracteres + " caracteres");
        
        System.out.print("¿Desde que caracter quieres obtener la nueva cadena?: ");
        desde = userInput.nextInt();
        
        System.out.print("¿Hasta que caracter quieres obtener la nueva cadena?: ");
        hasta = userInput.nextInt();
        
        textoSubstraccion = textoOriginal.substring(desde, hasta);
        
        System.out.println("La nueva cadena es: " + textoSubstraccion);
    }
}