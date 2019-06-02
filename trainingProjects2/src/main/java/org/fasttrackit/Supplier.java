package org.fasttrackit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Supplier
{
    private List<String> availableFood =  Arrays.asList("seeds", "fishFood", "meat", "fishMeat");
    private List<String> availableActivities = Arrays.asList("swim", "fly", "float on water", "run");

    public List<Food> supplyFood() {
        List<Food> food =  new ArrayList<Food>();
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Let's make the food supplies");
        System.out.println(" Supply with 2 types of food: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < availableFood.size(); ++i) {
            System.out.println((i+1) + ". " + availableFood.get(i));
        }
        for (int i = 0; i < 2 ; ++i) {
            int foodNumber = scan.nextInt();
            food.add(new Food(availableFood.get(foodNumber-1)));
        }
        return food;
    }

    public List<EntertainmentActivity> supplyActivities() {
        List<EntertainmentActivity> activities = new ArrayList<EntertainmentActivity>();
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Let's make the activities supplies");
        System.out.println(" Supply with 2 types of activities: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < availableActivities.size(); ++i) {
            System.out.println((i+1) + ". " + availableActivities.get(i));
        }
        for (int i = 0; i < 2 ; ++i) {
            int activiyNumber = scan.nextInt();
            activities.add(new EntertainmentActivity(availableActivities.get(activiyNumber-1)));
        }
        return activities;
    }
    public Animal pickAnimal() {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Pick your animal: ");
        List<String> availableAnimals =  Arrays.asList("bird", "fish", "mamal", "reptile");
        for (int i = 0; i < availableAnimals.size() ; ++i) {
            System.out.println((i+1) + ". " + availableAnimals.get(i));
        }
        Scanner scan = new Scanner(System.in);
        int animalNumber = scan.nextInt();
        while (animalNumber >= 5 or animalNumber < 1) {
            System.out.println(" possible choices [1, 2, 3, 4] ");
            animalNumber = scan.nextInt();
        }
        if (animalNumber == 1) {
            return  new Bird();
        }
        if (animalNumber == 2) {
            return  new Fish();
        }
        if (animalNumber == 3) {
            return  new Mamal();
        }
        if (animalNumber == 4) {
            return  new Reptile();
        }
        return null;
    }

}
