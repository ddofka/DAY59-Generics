import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> skaiciai = new ArrayList<>();
        List<String> eilutes = new ArrayList<>();

        skaiciai.add(10);
        skaiciai.add(9);
        skaiciai.add(135);
        eilutes.add("vienas");
        eilutes.add("trys");
        eilutes.add("simtas tukstanciu");

        printList(skaiciai);
        printList(eilutes);

    }

    public static void printList(List<?> list){
        for (Object o:list){
            System.out.println(o);
        }
    }
}