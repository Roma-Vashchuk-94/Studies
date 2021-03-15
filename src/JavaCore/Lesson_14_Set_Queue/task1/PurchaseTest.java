package JavaCore.Lesson_14_Set_Queue.task1;

import java.util.*;

public class PurchaseTest {

    public static void main(String[] args) {
        Set<Purchase> shoppingList  = createShoppingList();
        printListSortedByName(shoppingList);
        System.out.println(shoppingList);
        printListSortedByCount(shoppingList);
        printListWithHash(shoppingList);
    }

    public static Set<Purchase> createShoppingList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. Welcome to your own shopping list. \nEnter your values:");
        Set<Purchase> list = new LinkedHashSet<>();
        String name;
        int count;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name:");
            name = scanner.nextLine();
            System.out.println("Enter count:");
            count = Integer.parseInt(scanner.nextLine());
            list.add(new Purchase(name, count));
        }
        return list;
    }

    public static void printListSortedByName(Set<Purchase> shoppingList) {
        System.out.println(new TreeSet<>(shoppingList));
    }

    public static void printListSortedByCount(Set<Purchase> shoppingList) {
        PurchaseCountComparator comparator = new PurchaseCountComparator();
        Set<Purchase> sortedSet = new TreeSet<>(comparator);
        sortedSet.addAll(shoppingList);
        System.out.println(sortedSet);
    }

    public static void printListWithHash(Set<Purchase> shoppingList) {
        for (Purchase p1 : shoppingList) {
            System.out.print(p1.getName() + " (hash code: " + p1.hashCode() + "); ");
        }
    }
}
