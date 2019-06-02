package org.fasttrackit;

public class StateOfAnimal {

    int age;
    int happiness;
    int hunger;
    int energy;

    public StateOfAnimal(String name, int age, int happiness, int hunger, int energy) {
        this.age = age;
        this.happiness = happiness;
        this.hunger = hunger;
        this.energy = energy;
    }
    public static void init (String name, int age, int happiness, int hunger, int energy) {
        System.out.println  ("                                       ------------------------");
        System.out.println  ("                                       My pet " + name + " has ");
        System.out.println  ("                                       age:      " + age);
        System.out.print    ("                                       happiness:");
        for (int i = 0; i < happiness; i++)
        {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print    ("                                       hunger:  ");
        for (int i = 0; i < hunger; i++)
        {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print    ("                                       energy:  ");
        for (int i = 0; i < energy; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
