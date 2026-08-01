class Pen{
    public String getMeaPen(int cost){
        if (cost>=10){
            return "PEN";}
            else{
        return "Nothing";}
        }
    }

public class Display{
    public static void main(String args[]){
        Pen obj = new Pen();
        String strobj = obj.getMeaPen(2);
        System.out.println(strobj);
    }
}