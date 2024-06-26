package extend.father;

public class GasCar extends Car {
    public void move (){
        System.out.println("가스차가 이동합니다!");
    }

    @Override
    public void openDoor() {
        System.out.println("가스차가 이동합니다.!");
    }

    public void fillup(){
        System.out.println("가스차가 주유합니다!");
    }

}
