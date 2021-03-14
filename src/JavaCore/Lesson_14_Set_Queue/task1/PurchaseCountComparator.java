package JavaCore.Lesson_14_Set_Queue.task1;

import java.util.Comparator;

public class PurchaseCountComparator implements Comparator<Purchase> {
    @Override
    public int compare(Purchase purchase, Purchase purchase2) {
        return purchase2.getCount() - purchase.getCount();
    }
}
