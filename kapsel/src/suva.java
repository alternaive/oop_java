import com.sun.xml.internal.ws.server.provider.AsyncProviderInvokerTube;

public class suva {
    private String nimi;

    suva(String nimi) {
        this.nimi=nimi;
    }

    public String getPangaNimi() {
    return this.nimi;
    }
}

class Tootaja
{
    private String nimi;
    Tootaja(String nimi){
        this.nimi = nimi;
    }

    public String getTootajaNimi() {
        return this.nimi;
    }
}

class SEB
{
public static void main (String[] args)
{
suva bank = new suva ("SEB");
Tootaja kertu = new Tootaja ("Kertu");
        System.out.println(kertu.getTootajaNimi()+"töötab" + bank.getPangaNimi() + "pankas");
}
}