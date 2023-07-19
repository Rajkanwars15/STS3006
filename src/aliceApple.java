import java.util.Scanner;
public class aliceApple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M");
        int M = sc.nextInt();
        System.out.println("Enter K");
        int K = sc.nextInt();
        System.out.println("Enter N");
        int N = sc.nextInt();
        System.out.println("Enter S");
        int S = sc.nextInt();
        System.out.println("Enter W");
        int W = sc.nextInt();
        System.out.println("Enter E");
        int E = sc.nextInt();

        System.out.print("Minimum value: ");
        if(M <= S*K){
            System.out.print(M);
        } else if (M <= S*K + E + W) {
            System.out.print((S * K) + (M - S * K) * K ); // (apples from South) + (remaining apples)*(number of apples per trees)
        }
        else {
            System.out.print(-1);
        }
    }
}
