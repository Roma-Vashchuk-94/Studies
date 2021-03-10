package JavaCore.Lesson_14_Set_Queue.task1;

import JavaCore.Lesson_2_VariableWrappersJVM.Array;

import java.util.*;

public class PurchaseTest {
    public static void main(String[] args) {

        Purchase purchase1 = new Purchase("bear", 11);
        Purchase purchase2 = new Purchase("milk", 16);
        Purchase purchase3 = new Purchase("butter", 18);
        Purchase purchase4 = new Purchase("meat", 14);

        Set<Purchase> set = new TreeSet<>(Arrays.asList(purchase1, purchase2, purchase3, purchase4));
        System.out.println(set);
        Set<Purchase> set1 = new TreeSet<>(new PurchaseToAmountComparator());
        set1.addAll(set);
        System.out.println(set1);
        Set<Purchase> set3 = new LinkedHashSet<>(Arrays.asList(purchase1, purchase2, purchase3, purchase4));
        System.out.println(set3);
        Set<Purchase> set4 = new HashSet<>(Arrays.asList(purchase1, purchase2, purchase3, purchase4));
        for (Purchase p : set4) {
            System.out.println(p.getName() + " " + "hashcode: " + p.hashCode());
        }

    }
}
