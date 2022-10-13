package hu.vargazsigmond.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Szamla> szamaLista = new ArrayList<>();

    public Bank() {

    }
}
/*
    public Szamla szamlanyitas(Tulajdonos tulajdonos, int HitelKeret){
        if (HitelKeret == 0)
        {
            MegtakaritasSzamla megtakaritasi = new MegtakaritasSzamla(tulajdonos);
            szamaLista.add(megtakaritasi);
            return megtakaritasi;
        }
        else {
           HitelSzamla hitelSzamla = new HitelSzamla(tulajdonos, HitelKeret);
           return hitelszamla;
        }
    }
    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int osszeg=0;
        for (Szamla sz : szamaLista){
            if (sz.getTulajdonos()==tulajdonos)
            {
                osszeg+=sz.getAktualisEgyenleg();
            }
        }
        return osszeg;
    }
}
*/