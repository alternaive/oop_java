public class Burger {
    private  String nimetus;
    private String liha;
    private String sai;
    private Double hind;
    private String lisand1;
    private Double lisand1Hind;
    private String lisand2;
    private Double lisand2Hind;
    private String lisand3;
    private Double lisand3Hind;
    private String lisand4;
    private Double lisand4Hind;

    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha=liha;
        this.sai=sai;
        this.hind=hind;
    }

    public Burger()

    public void valiLisand1() {
        if (lisand1 == "kurk") {
            lisand1Hind = 0.6;

        }
    }
    public void valiLisand2() {
        if (lisand2 == "tomat") {
            lisand2Hind = 0.7;
        }
    }
    public void valiLisand3() {
        if (lisand3 == "sibul") {
            lisand3Hind = 0.5;
        }
    }
    public void valiLisand4() {
        if (lisand4 == "salatilehed") {
            lisand4Hind = 0.4;
        }
    }








