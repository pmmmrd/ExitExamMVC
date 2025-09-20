import java.util.List;

public class StudentView {
    public void displaySubjects(List<Subject> subjects) {
        System.out.println("---------------- รายวิชาที่สามารถลงทะเบียน ----------------");
        for (Subject s : subjects) {
            System.out.println(s.getSubjectId() + " - " + s.getName() +
                    " (" + s.getCurrentStudents() + "/" + s.getMaxStudents() + ")");
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public void showEnrollments(Student student, List<Enrollment> enrollments) {
        System.out.println("---------------- ประวัติการลงทะเบียนของ " + student.getFullName() + " ----------------");
        for (Enrollment e : enrollments) {
            if (e.getStudent().equals(student)) {
                System.out.print(e.getSubject().getName());
                if (e.getGrade() != null) System.out.print(" | เกรด: " + e.getGrade());
                System.out.println();
            }
        }
    }

}

