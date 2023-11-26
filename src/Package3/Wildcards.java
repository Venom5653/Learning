package Package3;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    public static void main(String[] args) {
    List <Animal> listOfAnimal = new ArrayList<>();
    listOfAnimal.add(new Animal(1));
    listOfAnimal.add(new Animal(2));

    List<Dog> dogList = new ArrayList<>();
    dogList.add(new Dog());
    dogList.add(new Dog());

    test(listOfAnimal);
    test(dogList);
    }

    private static void test(List<? extends Animal > list){
        for (Animal animal : list){
            animal.eat();
        }
    }
}

