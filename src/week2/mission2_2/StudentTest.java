package week2.mission2_2;


public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student("Kim", 1001);
        Student studentLee = new Student("Lee", 1002);

        studentKim.setMajorSubject("수학");
        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 100);

        studentLee.setMajorSubject("국어");
        studentLee.addSubject("국어", 55);
        studentLee.addSubject("수학", 55);
        studentLee.addSubject("영어", 100);
        System.out.println("이름" + "\t\t" + "학번" + "\t\t" + "전공 과목" + "\t\t" + "국어"+ "\t\t" + "수학" + "\t\t" + "영어");


        studentKim.showStudentSaveInfo();
        studentLee.showStudentSaveInfo();

        System.out.println();

        studentKim.showStudentInfo();
        studentLee.showStudentInfo();

    }
}
