package week2.mission2_2;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String studentName; // 학생 이름
    private int studentID; // 학번
    private String majorSubject; // 전공 과목
    List<Subject> subjectList;
    int total = 0; // 총점

    public Student() {}

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectScore(subjectScore);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        System.out.println(studentName + " 학생은 " + subjectList.size()+"과목을 수강했습니다.");
        System.out.println("총점은 " + total + "이고 평균은 " + total / subjectList.size() + "점입니다.");

    }

    public void showStudentSaveInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(studentName + "\t\t" + studentID + "\t\t" + majorSubject);
        for(Subject s : subjectList) {
            total += s.getSubjectScore();
            sb.append("\t\t" + s.getSubjectScore());
        }
        System.out.println(sb);
    }

}