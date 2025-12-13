import java.util.Scanner;
class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());

        if (n < 10)
            System.out.println("Single digit");
        else if (n < 100)
            System.out.println("Two digit");
        else if (n < 1000)
            System.out.println("Three digit");
        else
            System.out.println("More than three digits");
    }
}