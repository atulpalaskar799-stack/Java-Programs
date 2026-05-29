import java.util.*;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice:");
        int button = sc.nextInt();
        System.out.println("Enter Value of a");
        int a = sc.nextInt();
        System.out.println("Enter Value of b");
        int b = sc.nextInt();

        switch(button){
            case 1: int Addition = a + b;
                    System.out.println("Addition is " + Addition);
            break;
            case 2: int Subtraction = a - b;
                    System.out.println("Subtraction is " + Subtraction);
            break;
            case 3: int Multiplication = a * b;
                    System.out.println("Multiplication is " + Multiplication);
            break;
            case 4: int Division = a / b;
                    System.out.println("Division is " + Division);
            break;
                default: System.out.println("Invalid Choice");

        }
    }

}
