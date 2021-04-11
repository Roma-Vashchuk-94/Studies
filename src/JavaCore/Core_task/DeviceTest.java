package JavaCore.Core_task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.NoSuchElementException;

public class DeviceTest {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\38068\\IdeaProjects\\Studies_1\\src\\JavaCore\\Core_task\\Devises");
        List<Device> list = createListDevices(file);
        startMenu(list);
    }

    public static List<Device> createListDevices(File file) {
        StringBuilder allFile = null;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            allFile = new StringBuilder();
            while (inputStream.available() > 0) {
                allFile.append((char) inputStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] elements = String.valueOf(allFile).split("\r\n");
        List<Device> list = new ArrayList<>();
        for (String line : elements) {
            String[] fields = line.split(", ");
            list.add(new Device(Long.parseLong(fields[0]), fields[1], fields[2], Integer.parseInt(fields[3])));
        }
        return list;
    }

    public static void startMenu(List<Device> list) {
        System.out.println("Your commands:\n'1' - Print all elements;\n'2' - Find and print device by serial number;" +
                "\n'3' - Print all devices sorted by brand name;\n'4' - Print all devices that are more " +
                "expensive than 400;\n'5' - Print All devices which have zero (0) in serial number and the " +
                "price is less than 800;\n'6' - print he most expensive device;\n'exit' - finish program.\n" );
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter value:");
                String command = scanner.nextLine();
                switch (command) {
                    case "1": {
                        System.out.println("All elements:");
                        list.forEach(System.out::println);
                        System.out.println();
                        break;

                    } case "2": {
                        System.out.println("Enter serial number:");
                        String serialNumber = scanner.nextLine();
                        try {
                            Optional<Device> element = Optional.of(list.stream()
                                    .filter(elem -> elem.getSerialNumber() == Long.parseLong(serialNumber))
                                    .findFirst()
                                    .orElseThrow(() -> new NoSuchElementException("There is no product with such a serial number")));
                            System.out.println(element.get());
                            System.out.println();
                        } catch (NoSuchElementException e) {
                            System.out.println("Exception: " + e.getMessage());
                        }
                        break;

                    } case "3": {
                        System.out.println("All devices sorted by brand name:");
                        list.stream()
                                .sorted(Comparator.comparing(Device::getBrand))
                                .forEach(System.out::println);
                        System.out.println();
                        break;

                    } case "4": {
                        System.out.println("All devices that are more expensive than 400:");
                        list.stream().filter(elem -> elem.getPrice() >= 400).forEach(System.out::println);
                        System.out.println();
                        break;

                    } case "5": {
                        System.out.println("All devices which have zero (0) in serial " +
                                "number and the price is less than 800:");
                        list.stream().filter(elem -> String.valueOf(elem.getSerialNumber()).contains("0")
                                && elem.getPrice() < 800).forEach(System.out::println);
                        System.out.println();
                        break;

                    } case "6": {
                        System.out.println("The most expensive device:");
                        System.out.println(list.stream().max(Comparator.comparingInt(Device::getPrice)).get());
                        System.out.println();
                        break;

                    } case "exit": {
                        return;
                    }
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
