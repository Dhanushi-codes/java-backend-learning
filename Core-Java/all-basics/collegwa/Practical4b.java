import java.io.*;
class Car{
    String brand;
    String model;
    double price;

    //default constructor
    Car(){
        this("Unknown");
        System.out.println("Default Constructor");
    }

    //brand constructor
    Car(String brand){
        this(brand,"unknown");
        System.out.println("Brand Constructor");
    }

    //brand and model constructor
    Car(String brand , String model){
        this(brand,model,0.0);
        System.out.println("Brand Constructor , Model Constructor");
    }

    //Brand, Model and price constructor 
    Car(String brand,String model,double price){ 
        this.brand=brand; 
        this.price=price; 
        System.out.println("Brand,Model and Price Constructor"); 
    }

    void display(){ 
        System.out.println("Brand: "+brand); 
        System.out.println("Model: "+model); 
        System.out.println("Price: "+price); 
    } 
}

public class Practical4b {
    public static void main(String[] args) {
        System.out.println("Car 1"); 
        Car c1=new Car(); 
        c1.display(); 

        System.out.println("\nCar 2"); 
        Car c2=new Car();
        c2.display(); 

        System.out.println("\nCar 3"); 
        Car c3=new Car(); 
        c3.display();

        System.out.println("\nCar 4"); 
        Car c4=new Car(); 
        c4.display(); 
        }                                              
}
