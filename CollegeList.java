import java.util.Scanner;

class Person {
    private String name;
    private String contactNum;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setContactNum(String c) {
        contactNum = c;
    }

    public String getContactNum() {
        return contactNum;
    }
}

class Employee extends Person {
    private double salary;
    private String department;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String d) {
        department = d;
    }

    public String getDepartment() {
        return department;
    }
}

class Faculty extends Employee {
    private boolean status;

    public void setStatus(boolean s) {
        status = s;
    }

    public boolean isRegular() {
        return status;
    }
}

class Student extends Person {
    private String program;
    private int yearLevel;

    public void setProgram(String p) {
        program = p;
    }

    public String getProgram() {
        return program;
    }

    public void setYearLevel(int y) {
        yearLevel = y;
    }

    public int getYearLevel() {
        return yearLevel;
    }
}

public class CollegeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select type (E - Employee, F - Faculty, S - Student): ");
        char choice = scanner.next().charAt(0);
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter contact number: ");
        String contactNum = scanner.nextLine();

        if (choice == 'E') {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setContactNum(contactNum);

            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();
            employee.setSalary(salary);
            scanner.nextLine(); // consume newline

            System.out.print("Enter department: ");
            String department = scanner.nextLine();
            employee.setDepartment(department);

            System.out.println("Employee Details:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());

        } else if (choice == 'F') {
            Faculty faculty = new Faculty();
            faculty.setName(name);
            faculty.setContactNum(contactNum);

            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();
            faculty.setSalary(salary);
            scanner.nextLine(); // consume newline

            System.out.print("Enter department: ");
            String department = scanner.nextLine();
            faculty.setDepartment(department);

            System.out.print("Is the faculty member regular/tenured (Y/N)? ");
            char status = scanner.next().charAt(0);
            faculty.setStatus(status == 'Y');

            System.out.println("Faculty Details:");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNum());
            System.out.println("Salary: " + faculty.getSalary());
            System.out.println("Department: " + faculty.getDepartment());
            System.out.println("Status: " + (faculty.isRegular() ? "Regular/Tenured" : "Not Regular/Tenured"));

        } else if (choice == 'S') {
            Student student = new Student();
            student.setName(name);
            student.setContactNum(contactNum);

            System.out.print("Enter enrolled program: ");
            String program = scanner.nextLine();
            student.setProgram(program);

            System.out.print("Enter year level (1-4): ");
            int yearLevel = scanner.nextInt();
            student.setYearLevel(yearLevel);

            System.out.println("Student Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNum());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevel());

        } else {
            System.out.println("Invalid selection.");
        }

        scanner.close();
    }
}
