import java.util.Scanner;
class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;

        if (product > 0)
            System.out.println("Product is Positive");
        else if (product < 0)
            System.out.println("Product is Negative");
        else
            System.out.println("Product is Zero");
    }
}