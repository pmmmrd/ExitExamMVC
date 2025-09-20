import java.util.ArrayList;
import java.util.List;

public class SchoolModel {
    public List<Student> students = new ArrayList<>();
    public List<Subject> subjects = new ArrayList<>();
    public List<Enrollment> enrollments = new ArrayList<>();

    public boolean checkAge(Student s) {
        return s.getAge() >= 15;
    }

    public boolean checkMaxStudents(Subject sub) {
        return sub.getMaxStudents() == -1 || sub.getCurrentStudents() < sub.getMaxStudents();
    } // -1 คือ ไม่จำกัด

    public boolean checkPreSubject(Student s, Subject sub) {
        if (sub.getPreSubject() == null) return true;
        for (Enrollment e : enrollments) {
            if (e.getStudent().equals(s) && e.getSubject().getSubjectId().equals(sub.getPreSubject())
                    && e.getGrade() != null) {
                return true;
            }
        }
        return false;
    }

    public boolean enrollStudent(Student s, Subject sub) {
        if (!checkAge(s)) return false;
        if (!checkPreSubject(s, sub)) return false;
        if (!checkMaxStudents(sub)) return false;

        Enrollment e = new Enrollment(s, sub);
        enrollments.add(e);
        sub.addStudent();
        return true;
    }
}
