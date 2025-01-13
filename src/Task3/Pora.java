package Task3;

public class Pora<K,V> {

    private K raktas;
    private V reiksme;


    public Pora(K raktas, V reiksme) {
        this.raktas = raktas;
        this.reiksme = reiksme;
    }

    public K getRaktas() {
        return raktas;
    }

    @Override
    public String toString() {
        return "" + reiksme;
    }

    public void setRaktas(K raktas) {
        this.raktas = raktas;
    }

    public V getReiksme() {
        return reiksme;
    }

    public void setReiksme(V reiksme) {
        this.reiksme = reiksme;
    }
}

