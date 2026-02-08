// import java.util.Scanner;
// public class day18 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         n = sc.nextInt();
//         for(int i = 2;i<=n/2;i++){
//             if(n%i==0){
//                 System.out.println("not prime");
//                 break;
//             }
//             else{
//                 System.out.println("prime");
//                 break;
//             }

//         }
//     }
// }
import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int rev = 0;
        while (n!=0) {
        int d = n%10;
        rev = rev * 10+d;
        n=n/10;
        i++;
        }
    System.out.println(rev);        
    }
}
