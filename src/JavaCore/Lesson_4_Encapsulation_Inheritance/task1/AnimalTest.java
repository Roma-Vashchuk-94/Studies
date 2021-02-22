package JavaCore.Lesson_4_Encapsulation_Inheritance.task1;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal(50, "Cheetah");
        animal.run(animal.getName());
        animal.run();

        Cat cat = new Cat(34, "Murka");
        cat.run(cat.getName());
        cat.run();

        Dog dog = new Dog(43, "Barsik");
        dog.run(dog.getName());
        dog.run();
    }
}
