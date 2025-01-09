import java.util.List;

public class medziuMetodai {

    public static void ivairusMiskas(List<? extends Medis> list) {
        System.out.println("---Įvairus miškas---");
        for (Medis m : list) {
            m.turi();
        }
    }

    public static void spygliuociuMiskas(List<? extends Spygliuotis> list) {
        System.out.println("---Spygliuočių miškas---");
        for (Spygliuotis s : list) {
            s.turi();
        }
    }

    public static void berzuMiskas(List<? extends Berzas> list) {
        System.out.println("---Beržų miškas---");
        for (Berzas b : list) {
            b.turi();
        }
    }

}
