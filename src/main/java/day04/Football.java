package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Football {

    public String findSmallestDifference(String filename) {
        List<String> lines = new ArrayList<>();
        String team = "";
        int fGoal;
        int aGoal;
        int minValue = 9999;

        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

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

    public static void main(String[] args) {

        Football football = new Football();
        System.out.println(football.findSmallestDifference("src/main/resources/football.dat"));

    }
}

