package Task4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private final List<Double> doubleList = new ArrayList<>();

    public void addNumber(Double skaicius){
        doubleList.add(skaicius);
    }

    public Double getAverage(){
        Double sum = 0.00;
        for (Double d:doubleList){
            sum+=d;
        }
        return sum/doubleList.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "numbers=" + doubleList +
                '}';
    }
}
