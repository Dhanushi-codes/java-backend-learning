import java.util.*;
public class printtable {
    public static void main(String[] args){
        System.out.print("Enter a number for the desired table:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<=10; i++){
        System.out.println(n+"x"+i+"="+(i*n));
        }
    } 
}
