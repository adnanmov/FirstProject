import java.util.Scanner ;
public class main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the 1st number");
    int firstNo = scanner.nextInt();
    System.out.println("Enter the 2nd number");
    int secNo = scanner.nextInt();
    int mul = firstNo * secNo;
    System.out.println("It's " + mul);
    scanner.close();

}
}