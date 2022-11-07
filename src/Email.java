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
    }

}
