
package Hafitz07225_Entity;

public class Hafitz07225_PenjualEntity extends Hafitz07225_TokoAbstractEntity{
    private String umur;

    public Hafitz07225_PenjualEntity(String nomor, String nama, String password, String umur) {
        super(nomor, nama, password);
        this.umur = umur;
    }
    @Override
    public String getNomor(){
        return nomor;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
    
}
