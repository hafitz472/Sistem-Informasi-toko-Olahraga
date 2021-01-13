
package Hafitz07225_Controller;
import Hafitz07225_Entity.Hafitz07225_PenjualEntity;
import Hafitz07225_Entity.Hafitz07225_DaftarbarangEntity;
import Hafitz07225_Entity.Hafitz07225_PembeliEntity;
import java.util.Date;
import java.util.ArrayList;
public class Hafitz07225_PenjualController implements Hafitz07225_ControllerInterface{
    int indexLogin;
    int cek;
public Hafitz07225_PenjualController(){

}

   public int cekData(String nomor,String password){
      cek = Hafitz07225_AllObjectModel.penjualModel.cekData(nomor, password);
      return cek;
   }
    
    @Override
    public void login(String nomor , String password){
        indexLogin = Hafitz07225_AllObjectModel.penjualModel.cekData(nomor,password);
    }
    public void insert(String nomor, String password, String nama,String umur){
       Hafitz07225_AllObjectModel.penjualModel.insertPenjual(new Hafitz07225_PenjualEntity(nomor,password,nama,umur));
    }
    public Hafitz07225_PenjualEntity PenjualEntity07225() {
        return Hafitz07225_AllObjectModel.penjualModel.showDataPenjual(indexLogin);
    }
    public ArrayList<Hafitz07225_PenjualEntity>penjualEntity(){
        return Hafitz07225_AllObjectModel.penjualModel.penjualEntity();
    }
}