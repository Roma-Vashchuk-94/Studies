package JavaCore.Lesson_4_Encapsulation_Inheritance.task3;

public class CarTest {
    public static void main(String[] args) {
        Helm helm = new Helm(12, "textile", false);
        Wheel wheel = new Wheel(175, 60, 15);
        CarBody carBody = new CarBody("blue");
        Car car = new Car("Tesla", 400, carBody, wheel, helm);
        System.out.println(car.toString());
        System.out.println("\n...CAR TUNING...\n");
        car.setMaxSpeed(450);
        car.getHelm().changeTheSteeringWheelMaterial("leather");
        car.getHelm().installTheSportsSteeringWheel();
        car.getCarBody().changeColor("black");
        car.getWheel().installSportsTires();
        System.out.println(car.toString());
    }
}
