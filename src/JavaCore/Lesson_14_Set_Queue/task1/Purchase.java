package JavaCore.Lesson_14_Set_Queue.task1;

public class Purchase implements Comparable<Purchase> {

    private String name;
    private int amount;

    public Purchase(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Purchase o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}

