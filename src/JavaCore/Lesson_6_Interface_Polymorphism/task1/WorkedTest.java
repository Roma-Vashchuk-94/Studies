package JavaCore.Lesson_6_Interface_Polymorphism.task1;

public class WorkedTest {
    public static void main(String[] args) {
        WorkerHourlyRate worker1 = new WorkerHourlyRate(20);
        WorkerMonthlyPayment worker2 = new WorkerMonthlyPayment(2000);
        WorkerMonthlyPayment worker3 = new WorkerMonthlyPayment(1500);
        worker1.setHours(235);
        FinService service = new FinService();
        Employee[] workers = {worker1, worker2, worker3};
        for (Employee employee : workers) {
            service.pay(employee);
        }
    }
}
