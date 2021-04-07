package JavaCore.Core_task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeviceTest {
    public static void main(String[] args) {




    }

    public static String[] readFile() {
        File file = new File("C:\\Users\\38068\\IdeaProjects\\Studies_1\\src\\JavaCore\\Core_task\\Devises");
        StringBuilder allFile = null;

        try (FileInputStream inputStream = new FileInputStream(file)) {
            allFile = new StringBuilder();
            while (inputStream.available() > 0) {
                allFile.append((char) inputStream.read());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return String.valueOf(allFile).split("\r\n");
    }

    public static List<Device> createDevices(String[] elements) {
        List<Device> list = new ArrayList<>();
        for (String line : elements) {
            String[] fields = line.split(", ");
            list.add(new Device(Long.parseLong(fields[0]), fields[1], fields[2], Integer.parseInt(fields[3])));
        }
        return list;
    }

}
