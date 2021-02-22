package JavaCore.Lesson_4_Encapsulation_Inheritance.task4;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat Murka", 30, 10);
        System.out.println("Animal name - " + animal.getName() + "; speed - " + animal.getSpeed() + " km/hour; age - " + animal.getAge() + " years.");
        animal.setName("Dog Barsik");
        animal.setSpeed(50);
        animal.setAge(8);
        System.out.println("Animal name - " + animal.getName() + "; speed - " + animal.getSpeed() + " km/hour; age - " + animal.getAge() + " years.");
    }
}
