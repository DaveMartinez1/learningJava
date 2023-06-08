import java.util.Scanner;

public class LoginWithEquals{
    public static void main(String[] args){
        String username = "sysadmin", password = "admin12345", inputUsername = "", inputPasswd = "";
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("\t- Login -\nUsername: ");
        inputUsername = userInput.nextLine();
        
        System.out.print("Password: ");
        inputPasswd = userInput.nextLine();
        
        if (inputUsername.equals(username) && inputPasswd.equals(password)){
            System.out.println("Acceso válido!");
        } else{
            System.out.println("Datos inválidos!");
        }
    }
}