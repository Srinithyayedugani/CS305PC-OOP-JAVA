import java.util.Scanner;

class Lab2P5 {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        int count = 0;
        int i = 2;

        while (i <= a / 2) {
            if (a % i == 0) {
                count++;
                break;
            }
            i++;
        }

        if (count == 0 && a > 1) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}