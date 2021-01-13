
package Hafitz07225_Entity;

public class Hafitz07225_PembeliEntity extends Hafitz07225_TokoAbstractEntity{
    private String alamat;

    public Hafitz07225_PembeliEntity(String nomor, String password, String nama,String alamat) {
        super(nomor,password,nama);
        this.alamat = alamat;
    }
    @Override
    public String getNomor(){
        return nomor;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
