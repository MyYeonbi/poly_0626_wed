package poly;

import java.util.Scanner;

public class PolyMain2 {
    public static void main(String[] args) {
        Animal animal;

        Scanner sc = new Scanner(System.in);

        System.out.print("듣고 싶은 동물을 고르세요(1.오리 2.강아지 3.고양이 4.말");
        int choice = sc.nextInt();

        if(choice == 1) {
            animal = new Duck();
        } else if(choice == 2) {
            animal = new Dog();
        } else if(choice == 3) {
            animal = new Cat();
        } else{
            animal = new Horse();
        }


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
