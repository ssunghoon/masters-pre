package week3.mission1;

import java.util.ArrayList;

public class DepartmentStore {
    public static void main(String[] args) {
        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(new Red("James", 10000, 2));
        memberList.add(new Red("Tomas", 30000, 2));
        memberList.add(new Platinum("Edward", 10000, 2));
        memberList.add(new Platinum("Percy", 30000, 2));
        memberList.add(new Diamond("Elizabet", 30000, 2));

        for(Member m : memberList) {
            System.out.println(m.showMemberInfo());
        }

    }
}
