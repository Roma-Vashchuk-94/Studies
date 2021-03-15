package JavaCore.Lesson_14_Set_Queue.task1;

public class Purchase implements Comparable<Purchase> {

    private String name;
    private int count;

    public Purchase(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Purchase{" + "name='" + name + '\'' + ", count=" + count + '}';
    }

    @Override
    public int compareTo(Purchase purchase) {
        return this.name.compareTo(purchase.getName());
    }
}
