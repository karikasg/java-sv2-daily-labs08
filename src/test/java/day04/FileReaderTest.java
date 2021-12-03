package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void testWeather() {
        FileReader fileReader = new FileReader();
        assertEquals(14, fileReader.findSmallestTemperatureSpread("src/main/resources/weather.dat"));
    }

    @Test
    void testFootball() {
        FileReader fileReader = new FileReader();
        assertEquals("Aston_Villa", fileReader.findSmallestDifference("src/main/resources/football.dat"));
    }

}