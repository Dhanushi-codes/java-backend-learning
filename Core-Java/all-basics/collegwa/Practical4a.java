import java.io.*;
class Student{

    void studentdetails(int roll_no){
        System.out.println("Welcome please check your details:-\nYour roll no is: "+ roll_no);
    } 

    void studentdetails(String name){
        System.out.println("Your name is: "+ name);
    } 

    void studentdetails(double marks){
        System.out.println("Your marks is "+ marks +" out of 100.");
    } 
}
public class Practical4a {
        public static void main(String[] args) {
        Student s = new Student();
        s.studentdetails(5230);
        s.studentdetails("Dhanushi");
        s.studentdetails(73.33);
    }
    
}
