
import java.util.*;

class UniqueNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter the number=");
        num = sc.nextInt();
        if (isUnique(num)) {
            System.out.println("Number is Unique");
        } else {
            System.out.println("Number is not Unique");
        }
    }

    public static boolean isUnique(int num) {

        boolean digits[] = new boolean[10];

        while (num > 0) {
            int digit = num % 10;

            if (digits[digit]) {
                return false;
            }
            digits[digit] = true;
            num /= 10;
        }
        return true;
    }

}
