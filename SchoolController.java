import java.util.Scanner;

public class SchoolController {
    private SchoolModel model;
    private StudentView studentView;
    private SubjectView subjectView;
    private Scanner sc = new Scanner(System.in);

    public SchoolController(SchoolModel model, StudentView studentView, SubjectView subjectView) {
        this.model = model;
        this.studentView = studentView;
        this.subjectView = subjectView;
    }

    public void showMenu(Student student) {
        while(true) {
            System.out.println("\n---------------- เมนู ----------------");
            System.out.println("1. ลงทะเบียนเรียน");
            System.out.println("2. ดูรายละเอียดวิชา");
            System.out.println("3. ออกจากระบบ");
            System.out.print("เลือก : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    studentView.displaySubjects(model.subjects);
                    System.out.print("กรอกรหัสวิชาที่ต้องการลงทะเบียน : ");
                    String subId = sc.nextLine();

                    Subject sub = model.subjects.stream()
                            .filter(s -> s.getSubjectId().equals(subId))
                            .findFirst()
                            .orElse(null);

                    if (sub != null) {
                        boolean alreadyEnrolled = model.enrollments.stream()
                                .anyMatch(e -> e.getStudent().equals(student)
                                        && e.getSubject().equals(sub));

                        if (alreadyEnrolled) {
                            studentView.showMessage("คุณเคยลงทะเบียนวิชานี้ไปแล้ว");
                        } else {
                            if (model.enrollStudent(student, sub)) {
                                studentView.showMessage("ลงทะเบียนสำเร็จ!");
                            } else {
                                studentView.showMessage("ไม่สามารถลงทะเบียนได้");
                            }
                        }
                    } else {
                        studentView.showMessage("ไม่พบวิชา");
                    }
                    break;
                case 2:
                    System.out.print("กรอกรหัสวิชาที่ต้องการดู : ");
                    String detailId = sc.nextLine();
                    Subject s = model.subjects.stream().filter(subj -> subj.getSubjectId().equals(detailId)).findFirst().orElse(null);
                    if(s != null) subjectView.displaySubjectDetail(s);
                    else studentView.showMessage("ไม่พบวิชา");
                    break;
                case 3:
                    return;
            }
        }
    }
}

