package JavaCore.Lesson_16_Reflection_API.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CarReflection {


    public static void main(String[] args) throws Exception {
        Car car = new Car("Ferrari", "red", 320);
        Class<Car> carClass = Car.class;

// отримати поля класу (private в тому числі);
        Field[] declaredFields = carClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        System.out.println("\nBefore changes: " + car);
        Field carColor = carClass.getDeclaredField("color");
        carColor.setAccessible(true);
        carColor.set(car, "green");
        System.out.println("After changes: " + car + "\n");
        System.out.println();

// отримати всі методи (private в тому числі);
        Method[] declaredMethods = carClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        System.out.println();

// викликати 2 методи (один - з параметрами, другий - без параметрів).
        Method method = carClass.getDeclaredMethod("printInformation");
        method.setAccessible(true);
        method.invoke(car);
        System.out.println();

        method = carClass.getDeclaredMethod("drive", int.class);
        method.setAccessible(true);
        method.invoke(car, 234);
        System.out.println();

//отримати всі конструктори;
        Constructor[] constructors = carClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println();

 //створити екземпляр класу з двох різних конструкторів;
        Car car1 = (Car) carClass.newInstance();
        car1.setMaxSpeed(320);
        car1.setModel("dorrty");
        System.out.println(car1);

        Class[] param = {String.class, String.class, int.class};
        Car car2 = (Car) carClass.getConstructor(param).newInstance("Skoda", "Black", 220);
        System.out.println(car2);
    }
}
