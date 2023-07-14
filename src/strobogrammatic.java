/*import java.util.Scanner;
public class strobogrammatic {
    public static boolean isCharacter018(char c) {
        return c == '0' || c == '1' || c == '8';
    }

    public static boolean isCharacter69or96(char c) {
        return c == '6' && c == '9' || c == '9' && c == '6';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] digits = String.valueOf(num).toCharArray();
        if (digits.length == 1 && isCharacter018(digits[0])) {
            System.out.println("Strobogrommatic");
        }
        else{
            boolean isStrobogrammatic = true;
            for(int i=0; i <= digits.length-1; i++){
                if (!isCharacter018(digits[i])) {
                    isStrobogrammatic = false;
                    System.out.println("Not");
                    break;
                }

                if(isCharacter018(digits[i])) {
                    System.out.println("Strobogrommatic");
                }
                else {
                    System.out.println("Not");
                }
            }
        }
    }
}*/

//alt method; won't work , if it has to will have to store visited values and compare

import java.util.Scanner;
class strobogrammatic {
    public static boolean isStrobogrammatic(char[] digits) {
        int left = 0;
        int right = digits.length - 1;

        while (left <= right) {
            char c1 = digits[left];
            char c2 = digits[right];
            if (c1 == '0' && c2 == '0' || c1 == '1' && c2 == '1' || c1 == '8' && c2 == '8' || c1 == '6' && c2 == '9' || c1 == '9' && c2 == '6') {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] digits = String.valueOf(num).toCharArray();

        if (isStrobogrammatic(digits)) {
            System.out.println("Strobogrammatic");
        } else {
            System.out.println("Not Strobogrammatic");
        }
    }
}

