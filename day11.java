
// import java.util.Scanner;
// public class day11 {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int s = n-1;
//     for(int i = 1;i<=n;i++){
//         for(int j = 1 ; j<=s;j++){
//             System.out.print(" ");
//         }
//         for(int k = 1;k<=i;k++){
//             System.out.print("*");
//         }  
//         s--;
//         System.out.println();
//         }
//     }
// }
import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n-1;
        int p = 1;
        for(int i = 1; i<=n;i++){
            for(int j = 1 ;j<=s;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=p;k++){
                System.out.print("*");
        }
            s--;
            p+=2;
            System.out.println();
        }
    }
}
