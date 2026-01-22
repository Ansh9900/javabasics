/*
import java.util.*;
public class day3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("enter your age");
        age = sc.nextInt();
        if (age>=18){
            System.out.println("yes you can vote");
        }
        else{
            System.out.println("you cant give vote");
        }

    }
    
}
*/
//////////////////////////////////////////////////////////////////
// import java.util.*;
// public class day3 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num;
//         num = sc.nextInt();
//         if (num%2==0){
//             System.out.println("even number");
//         }
//         else{
//             System.out.println("odd number");
//         }
//     }
// }
//////////////////////////////////////////////////////////////////////////

// import java.util.*;
// import javax.sound.sampled.SourceDataLine;
// public class day3 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int income;
//         income = sc.nextInt();
//         if ((1000000 > income) && (income > 500000)) {
//             System.out.println(income*0.2);
//         }

//         else if(income>1000000){
//             System.out.println(income*0.3);
//         }

//         else if (income > 500000) {
//             System.out.println(income);
//         }

//     }
// }
/////////////////////////////////////////////////////////////////////////
// import java.util.*;
// import javax.sound.sampled.SourceDataLine;

// public class day3 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a, b, c;
//         a = sc.nextInt();
//         b = sc.nextInt();
//         c = sc.nextInt();
//         if ((a > b) && (a > c)) {
//             System.out.println("a is largest");
//         } else if (b > c) {
//             System.out.println("b is largest");
//         } else {
//             System.out.println("c is largest");

//         }

//     }
// }
//////////////////////////////////////////////////////////////
// import java.util.*;
// import javax.sound.sampled.SourceDataLine;
// public class day3 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age=sc.nextInt();
//         String a;
//         a = (age>18)?"yes you can drive ":"you cant drive ";
//         System.out.print(a);

//     }
// }
//////////////////////////////////////////////////////////////////
// import java.util.*;
// import javax.sound.sampled.SourceDataLine;
// public class day3 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         char operator = sc.next().charAt(0);
//         switch(operator){
//         case '+' : System.out.print(a+b);
//         break;
//         case '-' : System.out.print(a-b);
//         break;
//         case '*' : System.out.print(a*b);
//         break;
//         case '/' : System.out.print(a/b);
//         break;
//         } 
//     }
// }