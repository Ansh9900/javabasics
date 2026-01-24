// import java.util.Scanner;

// public class day5 {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0;i<n;i++ ){
//             for(int j = i;j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.Scanner;

// public class day5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print(j);

//             }
//             System.out.println();
//         }        
//     }
// }
//////////////////////////////////////////////////////////////////
// import java.util.Scanner;

// public class day5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         char var = 'a';
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print(var);
//                 var++;
//             }
//             System.out.println();
//         }        
//     }
// }
//////////////////////////////////////////////////////////////////////
// import java.util.Scanner;

// public class day5 {
//     public static void hollow_rectangle(int totrows ,int totcols){
//         for(int i =0;i<totrows;i++){
//             for(int j = 0 ;j<totcols;j++){
//                 if(i==0||i==totrows-1||j==0||j==totcols-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         //int n = sc.nextInt();
//         hollow_rectangle(4, 5);     
//     }
// }
////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<=4;i++){
            System.out.print("(4-i)*" "" + "*i");
        }
    }
}
