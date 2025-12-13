import java.util.Scanner;
class SQ2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}