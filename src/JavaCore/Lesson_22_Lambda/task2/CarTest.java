package JavaCore.Lesson_22_Lambda.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CarTest {

    public static void main(String[] args) throws Exception {
        Optional<Car> dreamCar = Optional.of(new Car("Ferrari", "Red", 450));
        Optional<Car> carForEveryDay = Optional.ofNullable(null);
        Optional<Car> myCar = Optional.empty();

        List<Optional<Car>> garage = Arrays.asList(dreamCar, carForEveryDay, myCar);
        if (dreamCar.isPresent()) {
            System.out.println(dreamCar.get());
        }
        garage.forEach(car -> car.ifPresent(System.out::println));

        Car car1 = new Car("Volkswagen Polo", "blue", 210);

        System.out.println(carForEveryDay.orElse(car1));
        System.out.println(myCar.orElseGet(() -> car1));
//      System.out.println(myCar.orElseThrow(() -> new Exception("No element")));


       Optional<Car> d = dreamCar.map(car -> {car.setMaxSpeed(123); return car;});
       System.out.println(d.get());


    }
}
