package week3.mission1;

public class Diamond extends Member {

    private int professionalCounselorNum = 121;

    public Diamond(String memberName, int price, int stayTime) {
        super(memberName, price, stayTime);
        discountRate = 0.1;
        bonusRate = 0.1;
    }

    @Override
    public int parkingPrice(int stayTime) {
        return stayTime * 0;
    }

    @Override
    public String showMemberInfo() {
        StringBuilder sb = new StringBuilder();
        return super.showMemberInfo() + sb.append("담당 상담원 번호는 " + professionalCounselorNum + " 입니다.");
    }

}
