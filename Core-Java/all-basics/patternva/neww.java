
//PRINT LINE OF * MAYBE 4
//      *
//      *
//      *
//      *

// public class numberoneclass {
//     public static void main(String[] args) {
//         for(int i=1;i<5;i++){
//         System.out.println("*");
//         }}
// }


//PRINT RECTANGLE OF * r=4 c=5
//          *****
//          *****
//          *****
//          *****
// public class numberoneclass {
// public static void main(String[] args) {
//     for(int r=1;r<5;r++){
//         for(int c = 1; c <= 5; c++){
//             System.out.print("*");
//         }System.out.println("");
//     }
// }
// }


//PRINT AN HOLLOW RECTANGLE
//        *****
//        *   *
//        *   *
//        *****
public class neww{
    public static void main(String[] args){
        int r =4;
        int c =5;
        for(int i = 1;i<=r;i++){
            for(int j = 1; j <= c; j++){
                if(i==1 || j==1 || i==r || j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                }
            }System.out.println("");
        }
    }
