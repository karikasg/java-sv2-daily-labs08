package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public int findSmallestTemperatureSpread(String filename) {
        List<String> lines = new ArrayList<>();
        int day;
        double max;
        double min;
        double minValue = 9999;
        int minDay = 0;

        lines = readFile(filename);

        for (int i = 2; i < lines.size() - 1; i++) {
            day = Integer.parseInt(lines.get(i).substring(0, 5).trim());
            max = Integer.parseInt(lines.get(i).substring(5, 8).trim());
            min = Integer.parseInt(lines.get(i).substring(9, 14).trim());
            if (max - min < minValue) {
                minValue = max - min;
                minDay = day;
            }
        }
        return minDay;
    }

    public String findSmallestDifference(String filename) {
        List<String> lines = new ArrayList<>();
        String team = "";
        int fGoal;
        int aGoal;
        int minValue = 9999;

        lines = readFile(filename);

        for (int i = 1; i < lines.size(); i++) {
            if (i != 18) {
                fGoal = Integer.parseInt(lines.get(i).substring(42, 45).trim());
                aGoal = Integer.parseInt(lines.get(i).substring(49, 52).trim());
                if (Math.abs(fGoal - aGoal) < minValue) {
                    minValue = (Math.abs(fGoal - aGoal));
                    team = lines.get(i).substring(7, 22).trim();
                }
            }
        }
        return team;
    }

    private List<String> readFile(String filename) {
        try {
            return Files.readAllLines(Paths.get(filename));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        System.out.println(fileReader.findSmallestTemperatureSpread("src/main/resources/weather.dat"));

        System.out.println(fileReader.findSmallestDifference("src/main/resources/football.dat"));

    }
}
