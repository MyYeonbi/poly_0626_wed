package poly;

public class PolyMain {
    public static void main(String[] args) {
       // Duck duck = new Duck();
       // Dog dog = new Dog();
        //Cat cat = new Cat();
        //Horse horse = new Horse();

        //duck.sound();
       // cat.sound();
        //cat.sound();
        //horse.sound();
        Animal[] animals = new Animal[4];
        animals[0] = new Duck();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Horse();

        for(int i = 0; i < animals.length; i++){
            animalSound(animals[i]);
        }
    }
    public static void animalSound(Animal animal){
        animal.sound();

    }
}
