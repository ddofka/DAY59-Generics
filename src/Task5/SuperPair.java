package Task5;

public class SuperPair<K,V> {
    private K zodis;
    private V reiksme;
    private Number eilesNumeris;

    public SuperPair(K zodis, V reiksme, Number eilesNumeris) {
        this.zodis = zodis;
        this.reiksme = reiksme;
        this.eilesNumeris = eilesNumeris;
    }

    public K getZodis() {
        return zodis;
    }

    public void setZodis(K zodis) {
        this.zodis = zodis;
    }

    public V getReiksme() {
        return reiksme;
    }

    public void setReiksme(V reiksme) {
        this.reiksme = reiksme;
    }

    public Number getEilesNumeris() {
        return eilesNumeris;
    }

    public void setEilesNumeris(Number eilesNumeris) {
        this.eilesNumeris = eilesNumeris;
    }
}
