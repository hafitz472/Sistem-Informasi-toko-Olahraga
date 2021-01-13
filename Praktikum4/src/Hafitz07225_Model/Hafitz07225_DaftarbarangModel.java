package Hafitz07225_Model;
import Hafitz07225_Entity.Hafitz07225_DaftarbarangEntity;
import Hafitz07225_Entity.Hafitz07225_BarangEntity;
import java.text.ParseException;
import java.util.ArrayList;
public class Hafitz07225_DaftarbarangModel implements Hafitz07225_ModelInterfaces{
    private ArrayList<Hafitz07225_DaftarbarangEntity> daftarbarangArrayList;
    public Hafitz07225_DaftarbarangModel(){
        daftarbarangArrayList = new ArrayList<Hafitz07225_DaftarbarangEntity>();
    }
    public void insertDataDaftarbarang(Hafitz07225_DaftarbarangEntity daftarbarang){
       daftarbarangArrayList.add(daftarbarang);
    }
    public ArrayList<Hafitz07225_DaftarbarangEntity> getDaftarbarangArrayList(){
        return daftarbarangArrayList;
    }
    public void remove(int index){
        daftarbarangArrayList.remove(index);
    }
    public int size(){
        return daftarbarangArrayList.size();
    }

    public ArrayList<Hafitz07225_DaftarbarangEntity>DaftarbarangEntity(){
        return daftarbarangArrayList;
    }
    @Override
    public int cekData(String nomor, String password){
        int loop = 0;
        if(daftarbarangArrayList.size()==0){
            loop = -1;
        }else{
        for(int i=0;i<daftarbarangArrayList.size();i++){
            if(showDaftarbarang(i).getPembeli().getNomor().equals(nomor)){
                loop = i;
                break;
            }else{
                loop = -2;
            }
            }
        }
        return loop;
    }
    public Hafitz07225_DaftarbarangEntity showDaftarbarang(int index){
        return daftarbarangArrayList.get(index);
    }
    public ArrayList<Hafitz07225_DaftarbarangEntity>alldatabarang(){
        return daftarbarangArrayList;
    }
}

