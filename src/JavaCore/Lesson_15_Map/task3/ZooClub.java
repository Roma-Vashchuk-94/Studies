package JavaCore.Lesson_15_Map.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private char qMarks = '"';
    private Map<Human, List<Animal>> zooClubList;

    public ZooClub() {
        zooClubList = new HashMap<>();
    }

    public Map<Human, List<Animal>> getZooClubList() {
        return zooClubList;
    }

    public void setZooClubList(Map<Human, List<Animal>> zooClubList) {
        this.zooClubList = zooClubList;
    }

    public void addHuman() {
        System.out.println("\nYou chose " + qMarks + "Add a person" + qMarks +
                "\nEnter name:");
        String name = ZooClubTest.scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(ZooClubTest.scanner.nextLine());
        Human human = new Human(name, age);
        zooClubList.put(human, new ArrayList<>());
        System.out.println("You added " + human + " to zoo club.");
    }

    public void addAnimal() {
        System.out.println("\nYou chose " + qMarks + "Add the animal to a person" + qMarks +
                "\nEnter person name:");
        String name = ZooClubTest.scanner.nextLine();
        System.out.println("Enter person age:");
        int age = Integer.parseInt(ZooClubTest.scanner.nextLine());
        Human human = new Human(name, age);
        Animal animal = Animal.createAnimal();
        if (isAnimalFree(animal)) {
            zooClubList.get(human).add(animal);
            System.out.println("You added " + animal + " to " + human);
        } else {
            System.out.println("Sorry, someone else has this pet");
        }
    }

    public void removeAnimal() {
        System.out.println("\nYou chose " + qMarks + "Remove the animal from a person" + qMarks +
                "\nEnter person name:");
        String name = ZooClubTest.scanner.nextLine();
        System.out.println("Enter person age:");
        int age = Integer.parseInt(ZooClubTest.scanner.nextLine());
        Human human = new Human(name, age);
        System.out.println("Enter animal type:");
        Pets type = Pets.valueOf(ZooClubTest.scanner.nextLine().toUpperCase());
        System.out.println("Enter animal name:");
        String animalName = ZooClubTest.scanner.nextLine();
        Animal animal = new Animal(type, animalName);
        zooClubList.get(human).remove(animal);
        System.out.println("You removed " + animal + " from a " + human);
    }

    public void removeHuman() {
        System.out.println("\nYou chose " + qMarks + "Remove a person" + qMarks +
                "\nEnter person name:");
        String name = ZooClubTest.scanner.nextLine();
        System.out.println("Enter person age:");
        int age = Integer.parseInt(ZooClubTest.scanner.nextLine());
        Human human = new Human(name, age);
        zooClubList.remove(human);
        System.out.println("You removed " + human + "from zoo club");
    }

    public boolean isAnimalFree(Animal animal) {
        for (Map.Entry<Human, List<Animal>> entry : zooClubList.entrySet()) {
            if (entry.getValue().contains(animal)) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        int i = 1;
        for (Map.Entry<Human, List<Animal>> entry : zooClubList.entrySet()) {
            System.out.println("\nParticipant number " + i + ":\n" + entry.getKey() +
                    "\nAnimals: " + entry.getValue());
            i++;
        }
    }
}
