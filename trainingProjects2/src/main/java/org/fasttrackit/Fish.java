package org.fasttrackit;

public class Fish extends Animal{
    int age=0;
    int happiness=0;
    int hunger=10;
    int energy=0;
    String name= "Dolphin";
    String favouriteFood = "fishFood";
    String food = "";
    Boolean hasFavouriteFood = false;

    public Fish(){
        System.out.println("Your pet's name is "+ name);
    }

    @Override
    public void sleep() {
        if (energy < 10) {
            energy = energy + 2;
        }
    }

    @Override
    public void eat() {
        if (hasFavouriteFood) {
            happiness++;
            if (hunger > 2) {
                hunger = hunger - 2;
                energy = energy + 2;
            }
        } else if (hunger > 1) {
            hunger --;
        }
    }

    @Override
    public void play() {
        happiness=happiness+3;
        hunger++;
        if (energy > 2) {
            energy = energy - 1;
        }
    }

    @Override
    public void grow() {
        if (happiness >= 8 && hunger <= 8 && energy >= 8){
            age++;
            happiness = happiness - 4;
            hunger++;
            energy = 7;
        }
    }

    @Override
    public void state(){
        StateOfAnimal.init(name, age, happiness, hunger, energy);
    }

    @Override
    public boolean isOld() {
        return age > 7;
    }
    @Override
    public boolean isFavouriteFood(String food) {
        hasFavouriteFood = (food == favouriteFood);
        return food == favouriteFood;
    }
}
