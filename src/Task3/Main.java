package Task3;

public class Main {
    public static void main(String[] args) {

        Mapas mapas = new Mapas();

        mapas.ideti(15,"Reiksme");
        mapas.ideti(1,"Reiksme 2");
        mapas.ideti(13,"Reiksme 3");
        System.out.println(mapas.gauti(13).toString());

        Mapas<DnsProvider,DnsServer> dnsMapas = new Mapas<>();
        dnsMapas.ideti(DnsProvider.GOOGLE,new DnsServer("8.8.8.8","8.8.4.4"));
        dnsMapas.ideti(DnsProvider.CLOUDFLARE, new DnsServer("1.1.1.1","1.0.0.1"));
        DnsServer googleDns = dnsMapas.gauti(DnsProvider.GOOGLE);
        System.out.println(googleDns);
        Mapas<String,String> zodynoMapas = new Mapas<>();
        zodynoMapas.ideti("Labas","Hello");
        zodynoMapas.ideti("Pasaulis","World");
        String labas = zodynoMapas.gauti("Labas");
        System.out.println(labas);

    }
}
