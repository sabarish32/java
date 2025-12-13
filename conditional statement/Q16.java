import java.util.Scanner;
class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0 && n % 5 == 0 && n % 8 != 0)
            System.out.println("Condition satisfied");
        else
            System.out.println("Condition not satisfied");
    }
}