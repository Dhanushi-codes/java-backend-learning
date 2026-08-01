
import java.util.*;
class dhanu{
    public static void main(String args[]){

        //PRINT OUTPUTS 
        //(shortcut for writing system.out.print just write sout and TAB button ko karo press)
        System.out.println("hello world"); //println means next line
        System.out.print("hello sana\n"); //\n means new line
        System.out.print("hello kinali"); // only normal print statement
        System.out.print("hello\ndhanu \nbeta\n"); //when we give 3 \n in the same print statement

        // Question: PRINT STARS IN THE ORDER 1 TO 4 INCREMENTING EACH AT ONCE
                //ANSWER NO1
        System.out.print("*\n**\n***\n****\n");
                    //OR
                //ANSWER NO2
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    
    //VARIABLE NAMES
    int a = 5; //varaible declarartion
    int b = 10;
    double price = 55.55;
    String name = "tony stark";
    b = 30; //changing variable value
    System.out.println(b);
    System.out.println(a);
    System.out.println(price);
    System.out.println(name);
    
    //ADDITION
    int r = 2;
    int t = 10;
    int sum = r + t;
    System.out.println(sum);
    int diff = r - t;
    System.out.println(diff);
    int mul = r * t;
    System.out.println(mul);

    //TAKE 2 NUMBERS FROM USER AND ADD THEM
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int addition = x+y;
    System.out.println(addition);

    Scanner dc = new Scanner(System.in);
    float number = dc.nextFloat();
    System.out.println(number + "x 1 =" + (number*1));
    System.out.println(number + "x 1 =" + (number*2));
    System.out.println(number + "x 1 =" + (number*3));
    System.out.println(number + "x 1 =" + (number*4));
    System.out.println(number + "x 1 =" + (number*5));
    System.out.println(number + "x 1 =" + (number*6));
    System.out.println(number + "x 1 =" + (number*7));
    System.out.println(number + "x 1 =" + (number*8));
    System.out.println(number + "x 1 =" + (number*9));
    System.out.println(number + "x 1 =" + (number*10));

    //CHECK AGE IS GREATER THAN OR NOT
    System.out.print("Enter your age:");
    Scanner nm = new Scanner(System.in);
    int age = nm.nextInt();
    if(age<18){
        System.out.println("Damn you are not 18");
    } else{
        System.out.println("You are 18");
    }

    //CHECK IF THE NUMBER TAKEN IS ODD OR EVEN
    System.out.print("Enter a number:");
    Scanner fr = new Scanner(System.in);
    int check_number = fr.nextInt();
    if(check_number%2==0){
        System.out.println("The number is even");
    }else{
        System.out.println("Not even");
    }

    //TAKE 2 INPUT P AND Q CHECK IF P=Q IF NOT IS P GREATER THAN OR LESS THAN Q
    Scanner vv = new Scanner(System.in);
    System.out.print("Enter 1st number:");
    int p = vv.nextInt();
    System.out.println(" ");
    System.out.print("Enter 2nd number:");
    int q = vv.nextInt();
    if (p==q){
        System.out.println("p equals q");
    } else if(p>q){
        System.out.println("p>q");       
    } else{
        System.out.println("p<q");
        }

//PRINT 1 NAMASTE 2 BONJOUR 3 HELLO WITH THE HELP OF SWITCH STATEMENT
        System.out.println("WELCOME TO SWITCH STATEMENTS");
        System.out.print("Enter a number from 1 2 3 only:");
        Scanner valid = new Scanner(System.in);
        int num1 = valid.nextInt();
        switch(num1){
            case 1:
                System.out.println("Namaste");
            break;
            case 2:
                System.out.println("Bonjour");
            break;
            case 3:
                System.out.println("Hello");
            break;
            default:
                System.out.println("Invalid");
            break; // default dont need break bcuz it is last statement by default
        }
    } 
}