package week3.mission1;

public class Platinum extends Member {
    public Platinum(String memberName, int price, int stayTime) {
        super(memberName, price, stayTime);
        discountRate = 0.05;
        bonusRate = 0.05;
    }

    @Override
    public int parkingPrice(int stayTime) {
        return stayTime * 1000;
    }
}
