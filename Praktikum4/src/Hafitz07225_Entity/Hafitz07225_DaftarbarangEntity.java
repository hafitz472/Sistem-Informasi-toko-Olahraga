package Hafitz07225_Entity;

public class Hafitz07225_DaftarbarangEntity {
    private Hafitz07225_PembeliEntity pembeli;
    private int IndexBarang;

    public Hafitz07225_DaftarbarangEntity(Hafitz07225_PembeliEntity pembeli, int IndexBarang) {
        this.pembeli = pembeli;
        this.IndexBarang = IndexBarang;
    }

    public Hafitz07225_PembeliEntity getPembeli() {
        return pembeli;
    }

    public void setPembeli(Hafitz07225_PembeliEntity pembeli) {
        this.pembeli = pembeli;
    }

    public int getIndexBarang() {
        return IndexBarang;
    }

    public void setIndexBarang(int IndexBarang) {
        this.IndexBarang = IndexBarang;
    }
}

