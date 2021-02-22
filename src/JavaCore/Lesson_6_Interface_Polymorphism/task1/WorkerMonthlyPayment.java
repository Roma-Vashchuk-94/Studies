package JavaCore.Lesson_6_Interface_Polymorphism.task1;

public class WorkerMonthlyPayment implements Employee {

    private int salary;

    public WorkerMonthlyPayment(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double salary() {
        return salary;
    }
}
