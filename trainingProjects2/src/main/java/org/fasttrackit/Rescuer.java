package org.fasttrackit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Rescuer 
{
    Animal animal;
    private List<Food> food = new ArrayList<Food>();
    private List<EntertainmentActivity> activities = new ArrayList<EntertainmentActivity>();

    Rescuer(Animal animal, List<Food> food, List<EntertainmentActivity> activities) {
        this.animal = animal;
        this.food = food;
        this.activities = activities;
    }
    boolean init() {
        if (animal.isOld()) {
            return false;
        }
        return true;
    }
    void playGame() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        animal.state();
        System.out.println("-------------------------------------------------------------");
        System.out.println( "--------------> Let's have fun!" );
        System.out.println( "   1. play " );
        System.out.println( "   2. eat " );
        System.out.println( "   3. sleep " );

        Scanner scan = new Scanner(System.in);
        int whatToDo = scan.nextInt();
        while (whatToDo >= 4) {
            System.out.println(" possible choices [1, 2, 3] ");
            whatToDo = scan.nextInt();
        }

        if (whatToDo == 1) {
            System.out.println("-------------------------------------------------------------");
            showActivities();
            animal.play();
            System.out.println("    It is so fun to play!");

        } else if (whatToDo == 2) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("    Choose the food:");

            showFood();

            whatToDo = scan.nextInt();
            while (whatToDo > food.size()) {
                whatToDo = scan.nextInt();
            }
            if (! animal.isFavouriteFood(food.get(whatToDo - 1).name)) {
                System.out.println("    Not my favourite food, but works..");
            } else {
                System.out.println("   My favourite food, thank you!");
            }
            animal.eat();

        } else if (whatToDo == 3) {
            animal.sleep();
            System.out.println("    Thank you for the sleep!");
        }
        System.out.println("-------------------------------------------------------------");

        animal.grow();
    }

    public void showFood() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("    availableFood: ");
        for (int i = 0; i < food.size(); ++i) {
            System.out.println("    "+ (i+1) + " " + food.get(i).name);
        }
    }
    public void showActivities() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("    availableActivities: ");
        for (int i = 0; i < activities.size(); ++i) {
            System.out.println("    -----    " + activities.get(i).name);
        }
        System.out.println();
    }
}