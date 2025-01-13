package Task3;

import java.util.ArrayList;
import java.util.List;

public class Mapas<K,V> {

     private final List<Pora<K,V>> sarasasPoru = new ArrayList<>();

     public void ideti(K raktas, V reiksme){
        sarasasPoru.add(new Pora<>(raktas,reiksme));
     }

     public V gauti(K raktas){
         for (Pora<K,V> p:sarasasPoru){
             if (p.getRaktas().equals(raktas)){
                 return p.getReiksme();
             }
         }
         return null;
     }
}
