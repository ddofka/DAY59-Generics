package Task4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private final List<Double> doubleList = new ArrayList<>();

    public void addNumber(Double skaicius){
        doubleList.add(skaicius);
    }

    public double getAverage(){
        Double sum = 0.00;
        for (Double d:doubleList){
            sum+=d;
        }
        double average = 0.00;
        try {
            average = sum/doubleList.size();
        }
        catch (ArithmeticException l){
            System.out.println(l.getMessage());
        }
        return average;
    }

    public static ListOfNumbers findWithMaxAverage(ListOfNumbers...listObject) {
        double maxAverage = 0.00;
        ListOfNumbers withMaxAverage = null;
        for (ListOfNumbers l:listObject){
            double listAv = l.getAverage();
            if (listAv > maxAverage){
                maxAverage = listAv;
                withMaxAverage = l;
            }
        }
        return withMaxAverage;
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "numbers= " + doubleList +
                '}';
    }
}
