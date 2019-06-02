package org.fasttrackit;

public class Bird extends Animal {

    int age=0;
    int happiness = 0;
    int hunger = 10;
    int energy = 0;
    String name = "Flamingo";
    String favouriteFood = "seeds";
    Boolean hasFavouriteFood = false;

    public Bird(){
        System.out.println("Your pet's name is "+ name);
    }

    @Override
    public void sleep() {
        if (energy < 10) {
            energy++;
        }
    }

    @Override
    public void eat() {
        if (hasFavouriteFood) {
            happiness++;
            hunger = hunger - 2;
            energy = energy + 2;
        } else if (hunger > 1) {
            hunger--;
        }
    }

    @Override
    public void play() {
        happiness++;
        energy--;
        hunger++;
    }

    @Override
    public void grow() {
        if (hunger <= 3 && happiness >= 7 && energy >= 8)
        {
            age++;
            happiness = happiness - 4;
            hunger++;
            energy = 6;
        }
    }

    @Override
    public void state(){
        StateOfAnimal.init(name, age, happiness, hunger, energy);
    }

    @Override
    public boolean isOld() {
        return age > 10;
    }

    @Override
    public boolean isFavouriteFood(String food) {
        hasFavouriteFood = (food == favouriteFood);
        return food == favouriteFood;
    }
}
