package JavaCore.Lesson_19_IO.task2;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private transient int age;
    private int id;
    private int salary;
    private Position position;

    public Employee(String name, int age, int id, int salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, int id, int salary, Position position) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        if (this.position != null) {
            string.append(name + ", id = " + id + ", salary = " +
                    salary + ", position = " + position + ";");
        } else {
            string.append(name + ", age = " + age + ", id = " + id + ", salary = " + salary + ";");
            }
        return string.toString();
    }
}
