// import java.util.Scanner;

// public class day8 {
//     public static int sum(int a , int b , int c){
//         return a+b+c;
//     }
//     public static int sum(int a,int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a ,b,c;
//         a = 2;
//         b = 3;
//         c = 2;
//         int result = sum(a, b);
//         int res2 = sum(a,b,c);
//     }
// }
import java.util.Scanner;
public class day8 {
    public static boolean ch_prime(int n){
        if (n==2) {
            return false;
        }
        else{
            for(int i = 2 ; i<=Math.sqrt(n);i++){
                if (n%i==0){
                    return false;
                }
            }
        }
        return true; 
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        System.out.println(ch_prime(n));
    }
}
