import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SchoolModel model = new SchoolModel();
        StudentView studentView = new StudentView();
        SubjectView subjectView = new SubjectView();
        SchoolController controller = new SchoolController(model, studentView, subjectView);

        // Students
        model.students.add(new Student("69000001", "นาย", "สมชาย", "ใจดี", LocalDate.of(2007, 5, 10), "โรงเรียน A", "somchai@mail.com","1234"));
        model.students.add(new Student("69000002", "นางสาว", "สมหญิง", "รุ่งเรือง", LocalDate.of(2006, 3, 22), "โรงเรียน A", "somying@mail.com","1234"));
        model.students.add(new Student("69000003", "นาย", "ปกรณ์", "ตั้งใจ", LocalDate.of(2008, 1, 15), "โรงเรียน B", "pakorn@mail.com","1234"));
        model.students.add(new Student("69000004", "นางสาว", "วิภา", "มณีทอง", LocalDate.of(2007, 7, 9), "โรงเรียน B", "wipa@mail.com","1234"));
        model.students.add(new Student("69000005", "นาย", "จิรศักดิ์", "แสนดี", LocalDate.of(2006, 11, 30), "โรงเรียน C", "jirasak@mail.com","1234"));
        model.students.add(new Student("69000006", "นางสาว", "สุนีย์", "เพชรรัตน์", LocalDate.of(2005, 8, 19), "โรงเรียน C", "sunee@mail.com","1234"));
        model.students.add(new Student("69000007", "นาย", "ธีรเดช", "ชัยชนะ", LocalDate.of(2008, 2, 1), "โรงเรียน D", "teeradej@mail.com","1234"));
        model.students.add(new Student("69000008", "นางสาว", "ปรียา", "สุขใจ", LocalDate.of(2007, 9, 5), "โรงเรียน D", "preeya@mail.com","1234"));
        model.students.add(new Student("69000009", "นาย", "อดิศักดิ์", "แข็งแรง", LocalDate.of(2006, 4, 25), "โรงเรียน E", "adisak@mail.com","1234"));
        model.students.add(new Student("69000010", "นางสาว", "ชลธิชา", "สวยงาม", LocalDate.of(2005, 12, 12), "โรงเรียน E", "chon@mail.com","1234"));

        // Subjects
        model.subjects.add(new Subject("05501001", "Mathematics", 3, "อ.โดเรม่อน", null, 30));
        model.subjects.add(new Subject("05501002", "Physics", 3, "อ.โนบิตะ", "05501001", 30)); // วิชาบังคับ
        model.subjects.add(new Subject("05501003", "Chemistry", 3, "อ.เก๊กฮวย", null, 25));
        model.subjects.add(new Subject("05501004", "Biology", 3, "อ.โคนัน", null, 20));
        model.subjects.add(new Subject("05501005", "Computer Science", 3, "อ.เขมจิรา", null, 40));
        model.subjects.add(new Subject("90691001", "English", 2, "อ.อองตัวเนต", null, 5));
        model.subjects.add(new Subject("90691002", "Thai Literature", 2, "อ.ไข่เจียว", null, 40));
        model.subjects.add(new Subject("90691003", "History", 2, "อ.ทันจิโร่", null, 30));
        model.subjects.add(new Subject("90691004", "Geography", 2, "อ.โกโจ", null, 30));
        model.subjects.add(new Subject("90691005", "Art", 2, "อ.เอเรน", null, -1));

        // ตัวอย่าง: สมชายลง Math ได้เกรดแล้ว
        Student somchai = model.students.get(0); // 69000001
        Subject math = model.subjects.get(0);    // 05501001
        Enrollment e1 = new Enrollment(somchai, math);
        e1.setGrade(3.5);
        model.enrollments.add(e1);
        math.addStudent();

        // Login
        Student student = null;
        while(student == null) {
            student = controller.login();
        }
        controller.showMenu(student);
    }
}
