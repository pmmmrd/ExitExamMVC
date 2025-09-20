public class Enrollment {
    private Student student;
    private Subject subject;
    private Double grade;

    public Enrollment(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
        this.grade = null; // ยังไม่มีเกรด
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
