import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity = 500;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName +" " + this.lastName);

        // Return Department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    // Method
    private String setDepartment() {
        System.out.println("Enter the department\n1 for Physics\n2 for Chemistry\n3 for Biology\n0 for None\n Enter department code: ");
        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();
        if (deptChoice == 1) {
            return "phy";
        }
        else if (deptChoice == 2) {
            return "chem";
        }
        else if (deptChoice == 3) {
            return "bio";
        }
        else {
            return "";
        }
    }

}
