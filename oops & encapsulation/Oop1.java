import java.util.Scanner;

class Employee {
    int id;
    int salary;
    void display() {
        System.out.println("ID: " + id + " Salary: " + salary);
    }
}

public class Oop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   

        Employee[] emp = new Employee[n]; 

        
        for (int i = 0; i < n; i++) {
            emp[i]=new Employee();
            emp[i].id=sc.nextInt();
            emp[i].id=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}
