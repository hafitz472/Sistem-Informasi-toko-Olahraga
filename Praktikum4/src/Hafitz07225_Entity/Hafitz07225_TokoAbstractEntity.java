
package Hafitz07225_Entity;

public abstract class Hafitz07225_TokoAbstractEntity {
    protected String nomor,nama;
    public String password;

    public Hafitz07225_TokoAbstractEntity(String nomor, String password, String nama) {
        this.nomor = nomor;
        this.password = password;
        this.nama = nama;
    }
    public Hafitz07225_TokoAbstractEntity(){

}
    public abstract String getNomor();

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}

