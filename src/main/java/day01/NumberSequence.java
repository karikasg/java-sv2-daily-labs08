package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Készíts egy day01.NumberSequence osztályt, aminek van egy egész számokból álló listája.
// Vagy egy kész listát kap konstruktoron keresztül és ez lesz az attribútum értéke,
// vagy három számot kap, melyből az első hogy hány véletlen számot generáljon a másik kettő pedig a minimum és maximum érték ami között generáljon.
// Legyen egy metódus closeToAverage(int value) ,ami kigyűjti és visszaadja azokat a számokat egy listában,
// amik az átlagtól legfeljebb a paraméterül átadott értékben térnek el!

public class NumberSequence {
    private List<Integer> numberList = new ArrayList<>();

    public NumberSequence(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public NumberSequence(int piece, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < piece; i++) {
            numberList.add(random.nextInt(max - min+1) + min);
        }
    }

    public List<Integer> closeToAverage(int value) {
        List <Integer> listCloseToAverage = new ArrayList<>();
        double average;
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        average = (double) sum / numberList.size();
        for (int num : numberList) {
            if (Math.abs(num - average) < value ) {
                listCloseToAverage.add(num);
            }
        }
        System.out.println(average);
        return listCloseToAverage;
    }

    @Override
    public String toString() {
        return "NumberSequence{" +
                "numberList=" + numberList +
                '}';
    }
}
