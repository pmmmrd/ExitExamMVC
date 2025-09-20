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
}

