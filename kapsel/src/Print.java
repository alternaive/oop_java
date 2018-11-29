public class Printer {

    private Integer tooneriTase;
    private Integer paberPrintimiseks;
    private Boolean kahepoolne;

    public Integer getTooneriTase() {
        return tooneriTase;
    }



    public Printer (Integer tooneriTase, Boolean kahepoolne) {
        if (tooneriTase >= 0 & tooneriTase <= 100){
            this.tooneriTase = tooneriTase;
    }   else if (tooneriTase > 100){
            this.tooneriTase=100;
        } else {
        this.tooneriTase =0;
        }
        this.kahepoolne = kahepoolne;
        this.paberPrintimiseks= 0;
    }
//  Meetod


    public Integer lisaTooner(Integer toonerJuurde) {
        if (tooneriTase >=0 & this.tooneriTase <=100){
            if(this.tooneriTase + toonerJuurde < 100){
                return -1;
            }
            this.tooneriTase = this.tooneriTase + toonerJuurde;
            return this.tooneriTase;
        } else {
            return -1;
        }
    }
    public Integer prindi(Integer lehtedeArv){
        Integer paberiKulu = lehtedeArv;
        if(this.kahepoolne){
            paberiKulu = lehtedeArv / 2 + lehtedeArv % 2;
            System.out.println("kahepoolne printimine");
        }
        if (paberiKulu > this.paberPrintimiseks){
            System.out.println("Printeris ei jätku paberit!");
            System.out.println("Lisa" + (paberiKulu - this.paberPrintimiseks) + " paberit juurde");
            return 0;
        }   else {
        this.paberPrintimiseks = this.paberPrintimiseks - paberiKulu;
        return paberPrintimiseks;
    }

    public Integer getPaberPrintimiseks() {
        return paberPrintimiseks;
    }
}