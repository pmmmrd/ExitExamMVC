
public class Subject {
    private String subjectId;
    private String name; // ชื่อวิชา
    private int credit; // หน่วยกิต
    private String teacher;
    private String preSubject;
    private int maxStudents;
    private int currentStudents;

    public Subject(String subjectId, String name, int credit, String teacher,
                   String preSubject, int maxStudents) {
        this.subjectId = subjectId;
        this.name = name;
        this.credit = credit;
        this.teacher = teacher;
        this.preSubject = preSubject;
        this.maxStudents = maxStudents;
        this.currentStudents = 0;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getPreSubject() {
        return preSubject;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getCurrentStudents() {
        return currentStudents;
    }

    public void addStudent() {
        currentStudents++;
    }
}
