package JavaCore.Lesson_2_VariableWrappersJVM;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть суму коштів:");
        int money = scanner.nextInt();
        System.out.println("Введіть відсоткову ставку на рік:");
        int interest = scanner.nextInt();
        System.out.println("Введіть кількість років:");
        int year = scanner.nextInt();
        System.out.println("Сума за даний проміжок становить:");
        System.out.println(allMoney(money, interest, year));
    }

    public static int allMoney (int money, int interest, int year) {
        double profitForTheYear = (money / 100.0) * interest;
        return (int) (money + profitForTheYear) * year;
    }
}
