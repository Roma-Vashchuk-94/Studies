package JavaCore.Lesson_19_IO.task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\38068\\IdeaProjects\\" +
                "Studies_1\\src\\JavaCore\\Lesson_19_IO\\task2\\ObjectSerialize");

        Employee e1 = new Employee("Tom",23, 1, 600);
        Employee e2 = new Employee("Jerry",45, 2, 700);
        Employee e3 = new Employee("Dack", 3, 800, new Position("Director"));

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e1, e2, e3));

        System.out.println(e1);
        Methods.serialize(e1, file);
        Employee e = Methods.deserialize(file);
        System.out.println(e);

        Methods.serialize(employeeList, file);
        List<Employee> list = Methods.deserialize(file);
        System.out.println(list);





      //  Methods.serialize(e1, file);


    }
}
