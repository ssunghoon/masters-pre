package week3.mission1;

public class Member {
    protected String memberName; // 고객 이름
    protected int payMoney; // 쇼핑 금액
    protected int stayTime; // 머문 시간
    protected double discountRate; // 할인률
    protected double bonusRate; // 보너스 적립률
    protected int bonusPoint; // 적립금

    public Member() {}

    public Member(String memberName, int payMoney, int stayTime) {  // 고객 이름, 쇼핑 금액, 머문 시간을 받는 생성자
        this.memberName = memberName;
        this.payMoney = payMoney;
        this.stayTime = stayTime;
    }

    public int calcPrice(int payMoney) {    // 포인트 적립과 할인률 적용하는 메서드
        bonusPoint += payMoney * bonusRate;
        return payMoney - (int)(payMoney * discountRate);
    }

    public int parkingPrice(int stayTime) { // 주차 요금을 계산하는 메서드
        return stayTime * 3500;
    }

    public String showMemberInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(memberName + "님의 지불 금액은 "
                             + calcPrice(payMoney) + "원이고, 적립 포인트는 "
                             + bonusPoint + "점 입니다." + "\r\n"
                             + "주차 요금은 " + parkingPrice(stayTime) + "원 입니다." + "\r\n");
        return stringBuilder.toString();
    }



}
