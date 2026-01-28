// public class day7 {
//     public static void main(){

//         int a = 10;
//         int b = 5;
//         int temp = a;
//              a=b;
//             b=temp;
//         System.out.print(a);
//         System.out.print(b);
//     }
// }
///////////////////////////////////////////////////////////////
// import java.util.*;
// public class day7 {
//     public static int product(int a,int b){
//         int mul = a*b;
//         return mul;
//     }
//     public static void main(){
//         Scanner sc = new Scanner(System.in);
//         int a,b;
//         a=sc.nextInt();
//         b=sc.nextInt();
//         int prod = product(a, b);
//         System.out.println("prod = " + prod);
//     }
// }
//////////////////////////////////////////////////////////////////////////
// import java.util.Scanner;

// public class day7 {
//     public static int fact(int n){
//         int factorial=1;
//         for(int i=1;i<=n;i++){
//             factorial=factorial*i;
//         }
//         return factorial;}
//     public static int bincoff(int n,int r){
//         int fact_n = fact(n);
//         int fact_r = fact(r);
//         int fact_nr = fact(n-r);
//         int bcoff = fact_n/(fact_r*fact_nr);
//         return bcoff;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int result = bincoff(a ,b);
        
//         System.out.println(result);
//     }
// }
////////////////////////////////////////////////////////////////////////
