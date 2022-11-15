package week3.mission1;

public class Red extends Member {
    public Red(String memberName, int price, int stayTime) {
        super(memberName, price, stayTime);
        discountRate = 0;
        bonusRate = 0.01;
    }

    @Override
    public int parkingPrice(int stayTime) {
        return stayTime * 3000;
    }
}
