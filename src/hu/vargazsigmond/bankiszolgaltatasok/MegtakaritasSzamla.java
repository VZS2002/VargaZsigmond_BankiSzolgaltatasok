package hu.vargazsigmond.bankiszolgaltatasok;

public class MegtakaritasSzamla extends Szamla {
    private double kamat;

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public static double alapKamat =10;

    public MegtakaritasSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }


    public boolean kivesz(int osszeg) {
        if (super.getAktualisEgyenleg() - osszeg >0) {
            super.aktualisEgyenleg -=osszeg;
            return true;
        }else {
            return false;
        }
    }


    public void kamatJovairas() {
        super.aktualisEgyenleg =(int) (aktualisEgyenleg*(1+kamat/100));
    }


}