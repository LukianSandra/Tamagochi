package org.fasttrackit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Game 
{
    private List<Food> availableFood = new ArrayList<Food>();
    private List<EntertainmentActivity> availableActivities = new ArrayList<EntertainmentActivity>();

    private void initFood(List<Food> food) {
        for (int i = 0; i < food.size(); ++i) {
            availableFood.add(food.get(i));
        }
    }
    private void initActivities(List<EntertainmentActivity> activities) {
        for (int i = 0; i < activities.size(); ++i) {
            availableActivities.add(activities.get(i));
        }
    }

    public void start () {
        String whatToDo = "no";
        do {
            Supplier sup = new Supplier();
            Animal animal = sup.pickAnimal();
            initFood(sup.supplyFood());
            initActivities(sup.supplyActivities());
            Rescuer res = new Rescuer(animal, availableFood, availableActivities);
            while (res.init()) {
                res.playGame();
            }
            System.out.println( "Your pet is dead." );
            System.out.println( "Begin new game? [yes/no]: " );
            Scanner scan = new Scanner(System.in);
            whatToDo = scan.next();
        } while ( whatToDo == "yes");

        System.out.println("--------------------------END GAME----------------------------");
    }
}