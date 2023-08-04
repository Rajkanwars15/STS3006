import java.util.Scanner;
class binaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check: ");
        int n = sc.nextInt();
        int rev = 0;
        int num = n;
        while(n>0) {
            rev <<= 1;
            if((n&1) == 1){
                rev = rev^1;
            }
            n = n>>1;
        }
        System.out.println("Reversed Number: " +  rev);
        if (num == rev) {
            System.out.println("It's a binary palindrome.");
        } else {
            System.out.println("It's not a binary palindrome.");
        }

    }
}
