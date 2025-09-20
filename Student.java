import java.time.LocalDate;

public class Student {
    private String studentId;
    private String title; // คำนำหน้า
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String school;
    private String email;
    private String password; 

    public Student(String studentId, String title, String firstName, String lastName,
                   LocalDate birthday, String school, String email, String password) {
        this.studentId = studentId;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.school = school;
        this.email = email;
        this.password = password;
    }

    public String getPassword() { return password; }

    public int getAge() {
        return java.time.Period.between(birthday, java.time.LocalDate.now()).getYears();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return title + " " + firstName + " " + lastName;
    }

}
