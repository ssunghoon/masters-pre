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
        
        /*
            James님의 지불 금액은 10000원이고, 적립 포인트는 100점 입니다.
            주차 요금은 6000원 입니다.

            Tomas님의 지불 금액은 30000원이고, 적립 포인트는 300점 입니다.
            주차 요금은 6000원 입니다.

            Edward님의 지불 금액은 9500원이고, 적립 포인트는 500점 입니다.
            주차 요금은 2000원 입니다.

            Percy님의 지불 금액은 28500원이고, 적립 포인트는 1500점 입니다.
            주차 요금은 2000원 입니다.

            Elizabet님의 지불 금액은 27000원이고, 적립 포인트는 3000점 입니다.
            주차 요금은 0원 입니다.
            담당 상담원 번호는 121 입니다.
        */

    }
}
