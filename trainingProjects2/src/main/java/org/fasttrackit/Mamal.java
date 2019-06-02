package org.fasttrackit;

public class Mamal extends Animal {

  int age=0;
  int happiness=0;
  int hunger=10;
  int energy=0;
  String name= "Polar Bear";
  String favouriteFood = "meat";
  Boolean hasFavouriteFood = false;

  public Mamal(){
      System.out.println("Your pet's name is "+name);
  }

  @Override
  void sleep() {
    if (energy < 10) {
      energy = energy + 2;
    }
  }

  @Override
  public void eat() {
    happiness++;
    if (hasFavouriteFood) {
      if (hunger > 3){
        hunger = hunger - 3;
        energy = energy + 2;
      }
    } else if (hunger > 1) {
      hunger--;
    }
  }

  @Override
  public void play() {
    happiness++;
    if (energy > 1) {
      energy--;
    }
    if (hunger > 1) {
      hunger--;
    }
  }

  @Override
  public void grow() {
    if (hunger <= 5 && energy >= 5 && happiness >= 5){
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
      return age > 20;
  }
  @Override
  public boolean isFavouriteFood(String food) {
      hasFavouriteFood = (food == favouriteFood);
      return food == favouriteFood;
  }
}
