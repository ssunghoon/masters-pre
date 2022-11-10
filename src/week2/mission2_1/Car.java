package week2.mission2_1;

public class Car {
    private static int carSerialNumber = 1000;
    private int carNumber;

    public Car() {
        carNumber = carSerialNumber;
        carSerialNumber++;
    }

    public int showCarNumber() {
        return carNumber;
    }

}
