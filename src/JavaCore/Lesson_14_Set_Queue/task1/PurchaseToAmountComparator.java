package JavaCore.Lesson_14_Set_Queue.task1;

import java.util.Comparator;

public class PurchaseToAmountComparator implements Comparator<Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o1.getAmount() - o2.getAmount();
    }
}
