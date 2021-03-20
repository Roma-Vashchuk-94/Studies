package JavaCore.Lesson_15_Map.task3;

import java.util.Scanner;

public class ZooClubTest {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        boolean b = true;
        System.out.println("Welcome to zoo club.");
        while (b) {
            try {
                System.out.println("Chose your action:\n1 - add a person;" +
                        "\n2 - add the animal to a person;\n3 - remove the animal from a person;" +
                        "\n4 - remove a person;\n5 - print all zoo club;\n6 - exit. ");
                String action = scanner.nextLine();
                switch (action) {
                    case ("1"): {
                        zooClub.addHuman();
                        break;
                    } case ("2"): {
                        zooClub.addAnimal();
                        break;
                    } case ("3"): {
                        zooClub.removeAnimal();
                        break;
                    } case ("4"): {
                        zooClub.removeHuman();
                        break;
                    } case ("5"): {
                        zooClub.print();
                        break;
                    } case ("6"): {
                        System.out.println("BYE =(");
                        b = false;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Some think's wrong. Try again");
            }
        }
    }
}
