import java.util.Scanner;
class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0 || n % 7 == 0)
            System.out.println("Divisible by 3 or 7");
        else
            System.out.println("Not divisible by 3 or 7");
    }
}
