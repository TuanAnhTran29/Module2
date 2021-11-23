import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;

import fruit.Fruit;
import fruit.Apple;
import fruit.Orange;


public class Main {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]= new Chicken();
        animals[1]= new Tiger();
        for (Animal animal: animals){
            animal.makeSound();

            if (animal instanceof Chicken){
                Edible edibler= (Chicken) animal;
                System.out.println(edibler.howToEat());


            }
        }


        Fruit[] fruits= new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]= new Orange();
        for (Fruit fruit: fruits ){
            System.out.println(fruit.howToEat());
        }



    }
}
