import java.util.Scanner;

public class day8 {
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b,c;
        a = 2;
        b = 3;
        c = 2;
        int result = sum(a, b);
        int res2 = sum(a,b,c);
    }
}
