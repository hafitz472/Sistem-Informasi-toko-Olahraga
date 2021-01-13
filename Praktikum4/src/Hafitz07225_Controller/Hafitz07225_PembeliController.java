
package Hafitz07225_Controller;
import Hafitz07225_Entity.Hafitz07225_BarangEntity;
import Hafitz07225_Entity.Hafitz07225_DaftarbarangEntity;
import Hafitz07225_Entity.Hafitz07225_PembeliEntity;
import Hafitz07225_Model.Hafitz07225_DaftarbarangModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class Hafitz07225_PembeliController implements Hafitz07225_ControllerInterface{
    int indexLogin = 0;
    public Hafitz07225_PembeliController(){      
    }
    public Hafitz07225_PembeliEntity getData(){
        return Hafitz07225_AllObjectModel.pembeliModel.showdatapembeli(indexLogin);
    }
    public void daftarPembeli(int indexBarang,Hafitz07225_PembeliEntity pembeli ){
        Hafitz07225_AllObjectModel.daftarbarangModel.insertDataDaftarbarang(new Hafitz07225_DaftarbarangEntity(pembeli,indexBarang));
    }
    public int size(){
        return Hafitz07225_AllObjectModel.daftarbarangModel.size(); 
    }
    public void remove(int index){
        Hafitz07225_AllObjectModel.daftarbarangModel.remove(index);    
    }
    @Override
    public void login(String nomor , String password){
        indexLogin = Hafitz07225_AllObjectModel.pembeliModel.cekData(nomor,password);
    }
    
    public void insert(String nomor, String password, String nama,String alamat){
       Hafitz07225_AllObjectModel.pembeliModel.insert(new Hafitz07225_PembeliEntity(nomor,password,nama,alamat));
    }
    public Hafitz07225_PembeliEntity PraktikanEntity(){
        return Hafitz07225_AllObjectModel.pembeliModel.showdatapembeli(indexLogin);
    }
    
    public int cekpembeli(String nomor,String password){
        int cek = Hafitz07225_AllObjectModel.daftarbarangModel.cekData(nomor,password);
        return cek;   
        }
    public Hafitz07225_DaftarbarangEntity showDaftarbarang(int index){
        return Hafitz07225_AllObjectModel.daftarbarangModel.showDaftarbarang(index);
    }
    public ArrayList<Hafitz07225_PembeliEntity>pembeliEntity(){
        return Hafitz07225_AllObjectModel.pembeliModel.pembeliEntity();
    }
    public ArrayList<Hafitz07225_DaftarbarangEntity>daftarbarangEntity(){
        return Hafitz07225_AllObjectModel.daftarbarangModel.DaftarbarangEntity();
    }
    public DefaultTableModel dataTabelpembeli(){
        DefaultTableModel dtmMhs = new DefaultTableModel();
        Object[] kolom = {"Nomor","Password", "Nama", "Alamat","Barang","Harga"};
        dtmMhs.setColumnIdentifiers(kolom);
        int size = Hafitz07225_AllObjectModel.daftarbarangModel.alldatabarang().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[6];
            data[0] = Hafitz07225_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPembeli().getNomor();
            data[1] = Hafitz07225_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPembeli().getPassword();
            data[2] = Hafitz07225_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPembeli().getNama();
            data[3] = Hafitz07225_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getPembeli().getAlamat();
            data[4] = Hafitz07225_BarangEntity.namaBarang[Hafitz07225_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getIndexBarang()];
            data[5] = Hafitz07225_BarangEntity.harga[Hafitz07225_AllObjectModel.daftarbarangModel.showDaftarbarang(i).getIndexBarang()];
            dtmMhs.addRow(data);
        }
        return dtmMhs;
}
}

