import java.util.Scanner;
public class main{
    public static void main(String[] args){
        System.out.println("Let's play number guessing!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number!\n and write that below");
        String number = scanner.nextLine();
        System.out.println("You are thinking of " + number);
    
    }
}