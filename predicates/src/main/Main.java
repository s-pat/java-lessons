package main;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("test", "dog");
        Animal animal2 = new Animal("test", "dog");
        Animal animal3 = new Animal("test", "cat");
        Animal animal4 = new Animal("test", "hamster");
		

        List<Animal> someList = List.of(animal1,animal2,animal3,animal4);

       Predicate<Animal> filterOutDog = animal -> !animal.getType().equalsIgnoreCase("dog");

       
       someList.stream().filter(filterOutDog).forEach(System.out::println);

      // someList = (List) someList.stream().filter(filterOutNumbersOver5).collect(Collectors.toList());
        //System.out.println(someList);

    }
}
