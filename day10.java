// half pyramid
// import java.util.Scanner;

// public class day10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0;i<=n;i++){
//             for(int j = 0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
// hollow rectangle
// import java.util.Scanner;
// public class day10 {
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int r = sc.nextInt();
//      int c = sc.nextInt();
//      for(int i = 1 ; i<=r;i++){
//         for(int j = 1 ;j<=c;j++){
//             if(i==r||i==1||j==1||j==c){
//             System.out.print("#");}
//             else{
//             System.out.print(" ");
//         }}
//         System.out.println();
//     }
//     }
// }
//reverse half pyramid
// import java.util.Scanner;

// public class day10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1 ; i<n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//inverted half-pyramid
// import java.util.Scanner;

// public class day10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i = 1;i<=n;i++){
//             for(int j = i;j<=n ;j++){
//                 System.out.print(a);
//                 a++;
//             }
//             a = 1;
//             System.out.println();
//         }
//     }
// }
//floyd's triangle
// import java.util.Scanner;
// public class day10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a =1;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print(a + " ");
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }
//
//0-1 traingle
// import java.util.Scanner;

// public class day10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 if((i+j)%2==0){
//                 System.out.print("1");}
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
