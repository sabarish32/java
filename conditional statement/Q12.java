import java.util.Scanner;
class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lastDigit = Math.abs(n) % 10;

        if (lastDigit % 2 == 0)
            System.out.println("Last digit is Even");
        else
            System.out.println("Last digit is Odd");
    }
}