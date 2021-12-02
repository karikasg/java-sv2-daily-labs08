package day01;

import day01.NumberSequence;

import java.util.Arrays;

public class NumberSequenceMain {
    public static void main(String[] args) {
        NumberSequence numberSequence = new NumberSequence(100, 1, 20);
        System.out.println(numberSequence);

        NumberSequence numberSequence2 = new NumberSequence(Arrays.asList(4, 6, 2, 7, 5, 3, 12, 9, 20));
        System.out.println(numberSequence2);

        System.out.println(numberSequence.closeToAverage(1));
    }
}
