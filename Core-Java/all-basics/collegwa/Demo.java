import java.io.*;
class Math{
    public void Area(int s){
        System.out.println("Area of the square is: "+s*s);
    }

    public void Area(int l, int b){
        System.out.println("Area of the rectangle is: "+l*b);
    }

    public void Area(double r){
        System.out.println("Area of the circle is: "+3.14*r*r);
    }
}

public class Demo{
    public static void main(String[] args) {
        Math m = new Math();
        m.Area(4);
        m.Area(2,2);
        m.Area(2.0);
    }
}