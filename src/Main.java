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

        System.out.println("-".repeat(50));

        Azuolas azuolas = new Azuolas();
        azuolas.turi();

        System.out.println("-".repeat(50));

        Berzas berzas = new Berzas();
        Berzas berzas2 = new Berzas();
        Berzas berzas3 = new Berzas();
        Egle egle = new Egle();
        Kadagys kadagys = new Kadagys();
        Pusis pusis = new Pusis();

        List<Medis> medziai = new ArrayList<>();
        medziai.add(azuolas);
        medziai.add(berzas);
        medziai.add(kadagys);
        medziai.add(pusis);
        List<Spygliuotis> spygliuociai = new ArrayList<>();
        spygliuociai.add(egle);
        spygliuociai.add(pusis);
        List<Berzas> berzai = new ArrayList<>();
        berzai.add(berzas);
        berzai.add(berzas2);
        berzai.add(berzas3);


        medziuMetodai.ivairusMiskas(medziai);
        medziuMetodai.spygliuociuMiskas(spygliuociai);
        medziuMetodai.berzuMiskas(berzai);
    }

    public static void printList(List<?> list){
        for (Object o:list){
            System.out.println(o);
        }
    }
}