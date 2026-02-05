import java.util.Scanner;

class Employee {
    int id;
    int salary;

    // Method to read employee details
    void getData(Scanner sc) {
        id = sc.nextInt();
        salary = sc.nextInt();
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + " Salary: " + salary);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of employees

        Employee[] emp = new Employee[n]; // array of objects

        // Read employee details
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].getData(sc);
        }

        // Display employee details
        System.out.println("Employee Details:");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();
    }
}
