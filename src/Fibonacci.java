import  java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        int count = 0;
        while(count < n){
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
    }
}
