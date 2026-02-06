import java.util.Scanner;

class Student {
    private int m1, m2, m3;


    Student(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    
    void Average() {
        int avg = (m1 + m2 + m3) / 3;
        System.out.println("Average: " + avg);
    }

    
    void Grade() {
        int avg = (m1 + m2 + m3) / 3;
        if (avg >= 75) System.out.println("Grade: Distinction");
        else if (avg >= 60) System.out.println("Grade: First Class");
        else if (avg >= 50) System.out.println("Grade: Second Class");
        else System.out.println("Grade: Fail");
    }
}

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        Student s = new Student(m1, m2, m3);

        
        s.Average();
        s.Grade();
    }
}
