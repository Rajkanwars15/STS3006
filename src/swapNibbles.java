import java.util.Scanner;
class swapNibbles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        int x = sc.nextInt();
        System.out.println("Output: " + ((x & 0x0F) << 4 | (x & 0xF0) >> 4));
    }
}
