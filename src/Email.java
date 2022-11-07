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
        this.department = setDepartment();
        System.out.println("EMAIL CREATED: " + this.firstName +" " + this.lastName);
    }

    // Method
    private String setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Devolopment\n3 for Accounting\n0 for None");
        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();
        if (deptChoice == 1) {
            return "sales";
        }
        else if (deptChoice == 2) {
            return "dev";
        }
        else if (deptChoice == 3) {
            return "acct";
        }
        else {
            return "";
        }
    }

}
