package JavaCore.Lesson_15_Map.task3;

import java.util.Objects;

public class Animal {

    private Pets type;
    private String name;

    public Animal(Pets type, String name) {
        this.type = type;
        this.name = name;
    }

    public Pets getType() {
        return type;
    }

    public void setType(Pets type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return type == animal.type &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }

    @Override
    public String toString() {
        char qMarks = '"';
        return type +" " + qMarks + name + qMarks;
    }

    public static Animal createAnimal() {
        Pets pet = null;
        System.out.println("Let's add an animal\nChose type of animal:\n1 - Dog;\n2 - Cat;\n3 - Fish;" +
                "\n4 - Bird\n5 - Hamster\n6 - Guinea pig;\n7 - Ant farm; \n8 - Lizard;" +
                "\n9 - Turtle\n10 - Snake.");
        String type = ZooClubTest.scanner.nextLine();
        switch (type) {
            case ("1"): pet = Pets.DOG;
                break;
            case ("2"): pet = Pets.CAT;
                break;
            case ("3"): pet = Pets.FISH;
                break;
            case ("4"): pet = Pets.BIRD;
                break;
            case ("5"): pet = Pets.HAMSTER;
                break;
            case ("6"): pet = Pets.GUINEA_PIG;
                break;
            case ("7"): pet = Pets.ANT_FARM;
                break;
            case ("8"): pet = Pets.LIZARD;
                break;
            case ("9"): pet = Pets.TURTLE;
                break;
            case ("10"): pet = Pets.SNAKE;
                break;
        }
        System.out.println("Enter animal name:");
        String name = ZooClubTest.scanner.nextLine();
        Animal animal = new Animal(pet, name);

        return animal;
    }
}
