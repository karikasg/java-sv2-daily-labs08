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
            numberList.add(random.nextInt(min, max+1));
        }
    }

    public List<Integer> closeToAverage(int value) {
        List <Integer> listCloseToAverage = new ArrayList<>();
        double avg = average();

        for (int num : numberList) {
            if (Math.abs(num - avg) <= value ) {
                listCloseToAverage.add(num);
            }
        }
        System.out.println(avg);
        return listCloseToAverage;
    }

    public double average() {
        double sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        return sum / numberList.size();
    }

    @Override
    public String toString() {
        return "NumberSequence{" +
                "numberList=" + numberList +
                '}';
    }
}
