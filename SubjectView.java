public class SubjectView {
    public void displaySubjectDetail(Subject s) {
        System.out.println("---------------- รายละเอียดวิชา ----------------");
        System.out.println("รหัสวิชา : " + s.getSubjectId());
        System.out.println("ชื่อวิชา : " + s.getName());
        System.out.println("ครูผู้สอน : " + s.getTeacher());
        System.out.println("หน่วยกิต : " + s.getCredit());
        System.out.println("จำนวนคนลงทะเบียน : " + s.getCurrentStudents() + "/" + s.getMaxStudents());
        System.out.println("วิชาบังคับก่อน : " + (s.getPreSubject() != null ? s.getPreSubject() : "-"));
    }
}

