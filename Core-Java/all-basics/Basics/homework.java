//MAKE A CALCULATOR:
import java.util.*;
public class homework {
    public static void main(String[] args){
        System.out.println("WELCOME TO THE BEST CALCULATOR OF THE WORLD");
        Scanner number = new Scanner(System.in);
        
        System.out.print("Enter 1st number:");
        int a = number.nextInt();

        System.out.print("Enter 2nd number:");
        int b = number.nextInt();

        System.out.println("Enter\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for remainder of the division\nEnter the desired number:");
        int c = number.nextInt();

        switch(c){
            case 1:
                System.out.println("Addition is: "+(a+b));
            break;
            case 2:
                System.out.println("Subtarction is:" +(a-b));
            break;
            case 3:
                System.out.println("Multiplication is: "+(a*b));
            break;
            case 4:
                System.out.println("Division is: "+(a/b));
            break;
            case 5:
                System.out.println("Remainder of the division is: "+(a%b));
                break;
            default:
                System.out.println("invalid number");
        }
    }   
}