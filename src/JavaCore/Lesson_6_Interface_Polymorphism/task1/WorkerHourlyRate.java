package JavaCore.Lesson_6_Interface_Polymorphism.task1;

public class WorkerHourlyRate implements Employee {

    private int salary;
    private int hours;

    public WorkerHourlyRate(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double salary() {
        return hours * salary;
    }
}
