package hu.vargazsigmond.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Szamla> szamlaLista = new ArrayList<>();

    public Bank() {

    }
    public Szamla szamlanyitas(Tulajdonos tulajdonos, int HitelKeret) {
        if (HitelKeret == 0) {
            MegtakaritasSzamla megtakaritasi = new MegtakaritasSzamla(tulajdonos);
            szamlaLista.add(megtakaritasi);
            return megtakaritasi;
        } else {
            HitelSzamla hitelszamla = new HitelSzamla(tulajdonos, HitelKeret);
            szamlaLista.add(hitelszamla);
            return hitelszamla;

        }
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int osszeg = 0;
        for (Szamla sz : szamlaLista) {
            if (sz.getTulajdonos() == tulajdonos) {
                osszeg += sz.getAktualisEgyenleg();
            }
        }
        return osszeg;
    }
}
