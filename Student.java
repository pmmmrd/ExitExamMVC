import java.time.LocalDate;

public class Student {
    private String studentId;
    private String title; // คำนำหน้า
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String school;
    private String email;

    public Student(String studentId, String title, String firstName, String lastName,
                   LocalDate birthday, String school, String email) {
        this.studentId = studentId;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.school = school;
        this.email = email;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return title + " " + firstName + " " + lastName;
    }

}
