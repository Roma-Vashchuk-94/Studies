package JavaCore.Lesson_13_Iterator_Comparator.task3;

import java.util.Scanner;

public class StorageTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        boolean b = true;
        System.out.println("HELLO!!! \nwelcome to your own storage!");

        while (b) {

            System.out.println("\nselect next action:\n" +
                    "1 - add commodity;\n" +
                    "2 - remove commodity;\n" +
                    "3 - replace commodity;\n" +
                    "4 - sort by name;\n" +
                    "5 - sort by length;\n" +
                    "6 - sort by weight;\n" +
                    "7 - sort by width;\n" +
                    "8 - print one commodity from your storage;\n" +
                    "9 - print all commodities from your storage;\n" +
                    "0 - exit;\n");
            int action = scanner.nextInt();
            switch (action) {
                case 1: {
                    storage.addToStorage(createNewCommodity());
                    System.out.println("!!!success!!!");
                    break;
                }
                case 2: {
                    try {
                        System.out.println("\nEnter index of commodity which you want to remove:\n");
                        storage.removeFromStorage(storage.getStorageList().get(scanner.nextInt()));
                        System.out.println("!!!success!!!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("\n!!!!!You haven't any commodity!!!!!\n");
                    }
                    break;
                }
                case 3: {
                    try {
                        System.out.println("\nEnter index of commodity which you want to replace:\n");
                        int index = scanner.nextInt();
                        System.out.println("\nEnter new commodity:\n");
                        storage.replaceInStorage(index, createNewCommodity());
                        System.out.println("!!!success!!!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("\n!!!!!!You haven't this commodity!!!!!!!\n");
                    }
                    break;
                }
                case 4: {
                    storage.sortByName();
                    System.out.println("!!!success!!!");
                    break;
                }
                case 5: {
                    storage.sortByLength();
                    System.out.println("!!!success!!!");
                    break;
                }
                case 6: {
                    storage.sortByWeight();
                    System.out.println("!!!success!!!");
                    break;
                }
                case 7: {
                    storage.sortByWidth();
                    System.out.println("!!!success!!!");
                    break;
                }
                case 8: {
                    try {
                        System.out.println("\nEnter index of commodity which you want to print:\n");
                        storage.print(scanner.nextInt());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("\n!!!!!!!You haven't this commodity!!!!!!\n");
                    }
                    break;
                }
                case 9: {
                    System.out.println(storage.getStorageList());
                    break;
                }
                case 0: {
                    System.out.println("BYE! BYE!");
                    b = false;

                }
            }
        }
    }

    public static Commodity createNewCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the commodity name:");
        String name = scanner.nextLine();
        System.out.println("Enter the commodity length:");
        int length = scanner.nextInt();
        System.out.println("Enter the commodity weight:");
        int weight = scanner.nextInt();
        System.out.println("Enter the commodity width:");
        int width = scanner.nextInt();
        return new Commodity(name, length, weight, width);
    }
}
