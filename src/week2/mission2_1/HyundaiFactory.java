package week2.mission2_1;

public class HyundaiFactory {
    private static HyundaiFactory factory = new HyundaiFactory();
    private HyundaiFactory() {}

    public static HyundaiFactory getFactory() {
        if(factory == null) {
            factory = new HyundaiFactory();
        }
        return factory;
    }

    public Car createCar() {
        return new Car();
    }
}
