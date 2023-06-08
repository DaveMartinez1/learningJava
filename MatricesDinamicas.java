import java.util.Scanner;

public class MatricesDinamicas{
    public static void main(String[] args){
        int filas = 0;
        int columnas = 0;
        int contador = 1;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("cuantas filas tendra la matriz: ");
        filas = userInput.nextInt();
        
        System.out.print("Cuantas columnas tendra la matriz: ");
        columnas = userInput.nextInt();
        
        int numeros[][] = new int [filas][columnas];
        
        for (int j = 0; j<filas; j++){
            for (int i = 0; i<columnas; i++){
                numeros[j][i] = contador;
                System.out.print("[" + numeros[j][i] + "]");
                contador++;
            }
            System.out.println("");
        }
    }
}