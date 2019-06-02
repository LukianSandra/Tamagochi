package org.fasttrackit;


public class Reptile extends Animal {
    int age =0;
    int hunger=10;
    int energy=0;
    int happiness=0;
    String name="Crocodile";
    String favouriteFood = "fishMeat";
    Boolean hasFavouriteFood = false;

    public Reptile(){
        System.out.println("Your pet's name is " + name);
    }

    @Override
    void sleep() {
        if (energy < 10) {
            energy = energy + 2;
          }
    }

    @Override
    void eat() {
        if (hasFavouriteFood) {
            if (hunger > 2) {
                hunger = hunger - 2;
                energy = energy + 2;
            }
            happiness++;
        } else if (hunger > 1){
            hunger--;
        }
    }

    @Override
    void play() {
        happiness++;
        if (hunger > 1) {
            hunger--;
        }
        if (energy > 2) {
            energy = energy - 2;
        }
    }

    @Override
    void grow() {
        if (energy >= 6 && hunger <= 5 && happiness >= 5){
            age++;
            happiness = happiness - 4;
            hunger++;
            energy = 5;
        }
    }

    @Override
    public void state(){
        StateOfAnimal.init(name, age, happiness, hunger, energy);
    }

    @Override
    public boolean isOld() {
        return age > 15;
    }

    @Override
    public boolean isFavouriteFood(String food) {
        hasFavouriteFood = (food == favouriteFood);
        return food == favouriteFood;
    }
}
