package day04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public int findSmallestTemeperatureSpread(String filename) {
        List<String> lines = new ArrayList<>();
        int day;
        double max;
        double min;
        double minValue = 9999;
        int minDay = 0;

        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (int i = 2; i < lines.size() - 1; i++) {
            day = Integer.parseInt(lines.get(i).substring(0,5).trim());
            max = Integer.parseInt(lines.get(i).substring(5,8).trim());
            min = Integer.parseInt(lines.get(i).substring(9,14).trim());
            if (max - min < minValue) {
                minValue = max - min;
                minDay = day;
            }
        }
        return minDay;
    }

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        System.out.println(fileReader.findSmallestTemeperatureSpread("src/main/resources/weather.dat"));

    }
}
