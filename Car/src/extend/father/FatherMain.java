package extend.father;

public class FatherMain {
    public static void main(String[] args) {
        Car car = new Car();
        GasCar gasCar = new GasCar();

        car.move();
        car.openDoor();

        gasCar.move();
        gasCar.openDoor();

    }
}
